package model.validations;

import Exceptions.ExcepcionDNI;
import Exceptions.ExcepcionFecha;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.*;

public class UserDataValidations {

    // Verifica que el ID tiene 9 caracteres: los primeros 8 son números y el noveno es una letra.
    public void checkId(String id) throws ExcepcionDNI {
        // Verificar que el ID tiene 9 caracteres
        if (id.length() != 9) {
            throw new ExcepcionDNI("El NIF debe tener 9 caracteres.");
        }

        // Verificar que los primeros 8 caracteres sean números
        for (int i = 0; i < 8; i++) {
            char caracter = id.charAt(i);
            int valor = Character.getNumericValue(caracter);

            // Si el valor no es un número (valor < 0 o > 9), lanzar excepción
            if (valor < 0 || valor > 9) {
                throw new ExcepcionDNI("Los primeros 8 caracteres del NIF deben ser números.");
            }
        }

        // Verifica que el noveno carácter sea una letra
        char letra = id.charAt(8);
        if (!Character.isLetter(letra)) {
            throw new ExcepcionDNI("El último carácter del NIF debe ser una letra.");
        }
    }

    public void checkFormatDate(String fecha) throws ExcepcionFecha {
        // Dividir la fecha en día, mes y año usando "/" como separador
        String[] fechas = fecha.split("/");

        // Si la fecha no tiene exactamente 3 partes, lanzar excepción
        if (fechas.length != 3) {
            throw new ExcepcionFecha("La fecha debe tener el formato dd/mm/yyyy.");
        }

        try {
            // Convertir cada parte a número
            int dia = Integer.parseInt(fechas[0]);
            int mes = Integer.parseInt(fechas[1]);
            int año = Integer.parseInt(fechas[2]);

            // Verificar si el día, mes y año son válidos
            if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || año <= 1999) {
                throw new ExcepcionFecha("Fecha fuera de rango válido.");
            }

        } catch (NumberFormatException e) {
            throw new ExcepcionFecha("La fecha contiene caracteres no válidos.");
        }
    }

    public Period calculateAge(String birthDate, int dia, int mes, int año, String[] fecha) {
        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(nacimiento, fechaActual);

        if (periodo.getYears() < 100) {
            System.out.println(periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + periodo.getDays() + " días.");
            return periodo;
        } else {
            System.out.println("null");
            return null;
        }
    }

    public boolean checkPostalCode(String zip) {
        if (zip.matches("\\d+")) {
            if (zip.length() == 5) {
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(str);

        if (matcher.matches()) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean isAlphabetic(String str) {
        Pattern pat = Pattern.compile(".*[a-zA-Z].*");
        Matcher match = pat.matcher(str);

        if (match.matches()) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean checkEmail(String email) {
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+(?:com|es)$");
        Matcher match = pat.matcher(email);

        if (match.matches()) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean checkName(String name) {
        Pattern pat = Pattern.compile(".*\\d.*");
        Matcher match = pat.matcher(name);

        if (name.length() >= 2 && name.length() <= 50 && !match.find()) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
