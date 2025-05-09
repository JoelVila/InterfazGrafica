package view.console;

import java.util.Scanner;
import model.validations.UserDataValidations;
import Exceptions.ExcepcionDNI;
import Exceptions.ExcepcionFecha;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDataValidations userData = new UserDataValidations();

        String id, fecha, zip, str, email;
        int dia = 0, mes = 0, año = 0;

        System.out.println("Introduce tu NIF:");
        id = sc.next();

        System.out.println("Introduce una fecha (Formato: dd/mm/yyyy): ");
        fecha = sc.next();

        System.out.println("Introduce tu codigo postal: ");
        zip = sc.next();

        System.out.println("Introduce texto o numeros:");
        str = sc.next();

        System.out.println("Introduce tu correo electronico:");
        email = sc.next();

        // Parsear fecha una sola vez para reutilizar en la edad
        String[] partesFecha = fecha.split("/");
        if (partesFecha.length == 3) {
            try {
                dia = Integer.parseInt(partesFecha[0]);
                mes = Integer.parseInt(partesFecha[1]);
                año = Integer.parseInt(partesFecha[2]);
            } catch (NumberFormatException e) {
                System.out.println("Error: La fecha ingresada no es válida.");
            }
        }

        int opcion = 0;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Validar NIF");
            System.out.println("2 - Validar formato de fecha");
            System.out.println("3 - Calcular edad");
            System.out.println("4 - Validar código postal");
            System.out.println("5 - Validar si el texto contiene números");
            System.out.println("6 - Validar si el texto NO contiene números");
            System.out.println("7 - Validar correo electrónico");
            System.out.println("8 - Validar nombre");
            System.out.println("9 - Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        userData.checkId(id);
                        System.out.println("NIF válido.");
                    } catch (ExcepcionDNI e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        userData.checkFormatDate(fecha);
                        System.out.println("Formato de fecha válido.");
                    } catch (ExcepcionFecha e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    userData.calculateAge(fecha, dia, mes, año, partesFecha);
                    break;

                case 4:
                    userData.checkPostalCode(zip);
                    break;

                case 5:
                    userData.isNumeric(str);
                    break;

                case 6:
                    userData.isAlphabetic(str);
                    break;

                case 7:
                    userData.checkEmail(email);
                    break;

                case 8:
                    userData.checkName(str);
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 9);

        sc.close();
    }
}
