
package TP1.PBA;

import java.util.Scanner;

public class LICONEX_G24 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
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
        
        //final int N = 100;
        //int[] lista = new int[N];
        
        /*public ExamenAuto(int cantidadpuertas, String patente, String marca, int cilindrada, String NombresApellido, String DNI, String fechanacimiento, String fechaexamen, double circuitotiempo, int circuitofaltas) {
        super(patente, marca, cilindrada, NombresApellido, DNI, fechanacimiento, fechaexamen, circuitotiempo, circuitofaltas);
        this.cantidadpuertas = cantidadpuertas;
    }*/
        
        ExamenAuto auto1 = new ExamenAuto(0, patente, marca, 0, NombresApellido, DNI, fechanacimiento, fechaexamen, 0, 0);
        
        System.out.println("ingrese su DNI");
        auto1.setDNI(entrada.nextLine());
        System.out.println("ingrese su Nombre y Apellido");
        auto1.setNombresApellido(entrada.nextLine());
       
        System.out.println("auto1 Aprobado ="+ auto1.AprobadoAuto());
        
        int Opcion = entrada.nextInt();
        
        if (Opcion==1) {
                
            
            
        }
        if (Opcion==2) {
            
        }
        if (Opcion==3) {
            
        }
        if (Opcion==9) {
            
        }
        
    }
    
}
