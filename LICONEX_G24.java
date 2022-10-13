package TP1V2.PBA;

import java.util.Scanner;

public class LICONEX_G24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("LICENCIAS DE CONDUCIR");
        System.out.println("Menú Principal");
        System.out.println("===============================");
        System.out.println("1.- Registrar Examen MOTO");
        System.out.println("2.- Registrar Examen AUTO");
        System.out.println("3.- Consultas");
        System.out.println("");
        System.out.println("9.- Cerrar la aplicación");
        System.out.println("");
        System.out.println("Ingrese una opción:");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                ExamenMoto moto1 = new ExamenMoto();
                
              
                
            System.out.println(moto1.toString());    
                break;

            case 2:
                System.out.println("eligio el caso 2");
                break;

            case 3: // Revisar posibilidad nuevos Métodos o Módulos
               /*
                System.out.println("LICENCIAS DE CONDUCIR");
                System.out.println("Menú Consultas");
                System.out.println("===============================");
                System.out.println("1.- Examen por DNI");
                System.out.println("2.- Exámenes de moto por FECHA");
                System.out.println("3.- Exámenes de auto por FECHA");
                System.out.println("4.- <Consulta Opcional>");
                System.out.println("9.- Volver al menú anterior");
                break;
                */

            case 9:
                
                break;

            default:
                System.out.println("El numero ingresado es incorrecto");
        }
        
// int lista[] = new int[]{DNI,NombreApellido,Patente,Cilindrada,Espejos};
    }

}
