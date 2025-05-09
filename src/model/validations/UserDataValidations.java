package model.validations;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.*;

public class UserDataValidations {
    

    // Verifica que el ID tiene 9 caracteres: los primeros 8 son números y el noveno es una letra.
    public boolean checkId(String id) {
        boolean nifVerificacion = false;

        // Verificar que el ID tiene 9 caracteres
        if (id.length() == 9) {
            // Verificar que los primeros 8 caracteres sean números
            for (int i = 0; i < 8; i++) {
                char caracter = id.charAt(i);
                int valor = Character.getNumericValue(caracter);

                // Si el valor no es un número (valor < 0 o > 9), devolvera false
                if (valor < 0 || valor > 9) {
                    return false;
                }
            }

            // Verifica que el noveno carácter sea una letra
            char letra = id.charAt(8);
            if (Character.isLetter(letra)) {
                nifVerificacion = true;
            }
        }

        return nifVerificacion;
    }

    public boolean checkFormatDate(String fecha) {
    boolean dateGuardar = false;

    // Dividir la fecha en día, mes y año usando "/" como separador
    String[] fechas = fecha.split("/");

    // Si la fecha tiene 3 partes (día, mes, año)
    if (fechas.length == 3) {
        try {
            // Convertir cada parte a número
            int dia = Integer.parseInt(fechas[0]);
            int mes = Integer.parseInt(fechas[1]);
            int año = Integer.parseInt(fechas[2]);

            // Verificar si el día, mes y año son válidos
            if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && año > 1999) {
                dateGuardar = true;
            }
        } catch (NumberFormatException e) {
            // Si hay un error al convertir, la fecha no es válida
            dateGuardar = false;
        }
    }

    return dateGuardar;
}


    // Esta funcion calcula la edad a partir de una fecha de nacimiento y la fecha actual. Si la edad es mayor o igual a 100, retornará null. Si es menor, 
    public Period calculateAge(String birthDate, int dia, int mes, int año, String[] fecha) {

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        // Cambia el orden de los parámetros para calcular la diferencia de nacimiento a fecha actual
        Period periodo = Period.between(nacimiento, fechaActual);

        if (periodo.getYears() < 100) {
            System.out.println(periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + periodo.getDays() + " días.");
            return periodo;
        } else {
            System.out.println("null");
            return null;
        }
    }

    // Verificar si el codigo postal es un numero y si es menor o igual a 5
   public boolean checkPostalCode(String zip) {
        // Verificar que el código postal solo contenga números
        if (zip.matches("\\d+")) {
            // Verificar que el código postal tenga una longitud de 5 dígitos (común en varios países)
            if (zip.length() == 5) {
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        } else {
            // Si no es numérico, retorna falso
            System.out.println(false);
            return false;
        }
    }

    // Verificamos si la cadena de texto (str) contiene al menos un numero
    public boolean isNumeric(String str) {
        // Creamos una variable de tipo Pattern y hacemos creas unpatron para verificar si contiene numeros
        Pattern pattern = Pattern.compile(".*\\d.*");

        // Creamos una varaible de tipo Matcher que hace aplicar al patron ya que compara el pattern y el string introducido anteriormente
        Matcher matcher = pattern.matcher(str);

        // Si el patron coincide, deveulve true, sino false
        if (matcher.matches()) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    // Verifica si una cadena contiene al menos una letra
    public boolean isAlphabetic(String str) {

        // Definimos un patrón que busca al menos una letra en cualquier parte de la cadena
        Pattern pat = Pattern.compile(".*[a-zA-Z].*");

        // Comprobamos si la cadena coincide con el patrón
        Matcher match = pat.matcher(str);

        // Si la cadena contiene una letra, devuelve true
        if (match.matches()) {
            System.out.println(true);
            return true;
        } else {
            // Si no contiene letras, devuelve false
            System.out.println(false);
            return false;
        }
    }

    // Verifica si el correo electrónico tiene un formato válido con dominios ".com" y ".es"
    public boolean checkEmail(String email) {
        // Creamos un patrón que verifica si el correo tiene formato adecuado y termina en .com o .es
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+(?:com|es)$");

        // Creamos un Matcher que aplica el patrón sobre el correo email
        Matcher match = pat.matcher(email);

        // Si el patrón coincide
        if (match.matches()) {
            System.out.println(true);  // Muestra true si el correo tiene el formato correcto
            return true;
        } else {
            System.out.println(false);  // Muestra false si no cumple con el formato
            return false;
        }
    }

// Verifica si el nombre tiene una longitud lógica (entre 2 y 50 caracteres) y no contiene números
    public boolean checkName(String name) {

        // Creamos un patrón que verifica si el nombre contiene algún número
        Pattern pat = Pattern.compile(".*\\d.*");

        // Aplicamos el patrón sobre el nombre para verificar si contiene números
        Matcher match = pat.matcher(name);

        // Verificamos que el nombre tenga entre 2 y 50 caracteres y no contenga números
        if (name.length() >= 2 && name.length() <= 50 && !match.find()) {
            System.out.println(true);  // Muestra true si el nombre es válido
            return true;
        } else {
            System.out.println(false);  // Muestra false  si el nombre no es válido
            return false;
        }

    }

}
