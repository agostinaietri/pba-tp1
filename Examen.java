package TP1V2.PBA;

public abstract class Examen {

    public String NombresApellido;
    public String DNI;
    public String fechaNacimiento;
    public String fechaExamen;

    public double circuitoTiempo;
    public int circuitoFaltas;
    
    //atributos vehículo
    
    public String patente;
    public String marca;
    public int cilindrada;
    
    //atributos examen auto
    
    public final int faltasCometidas=2;
    public final int tiempoUtilizado=29;
    public int cantidadpuertas;
    
    //atributos examen moto
    
    public final int faltaspermitidasmoto=4;
    public final int tiempopermitidomoto=20;
    public boolean todoslosespejos;

}
