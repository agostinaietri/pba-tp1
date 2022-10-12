
package TP1.PBA;


public class ExamenAuto extends Vehiculo {
    private final int faltasCometidas=2;
    private final int tiempoUtilizado=29;
    private int cantidadpuertas;

    public ExamenAuto(int cantidadpuertas, String patente, String marca, int cilindrada, String NombresApellido, String DNI, String fechanacimiento, String fechaexamen, double circuitotiempo, int circuitofaltas) {
        super(patente, marca, cilindrada, NombresApellido, DNI, fechanacimiento, fechaexamen, circuitotiempo, circuitofaltas);
        this.cantidadpuertas = cantidadpuertas;
    }

    
   

    public int getCantidadpuertas() {
        return cantidadpuertas;
    }

    public void setCantidadpuertas(int cantidadpuertas) {
        this.cantidadpuertas = cantidadpuertas;
    }
    
    
    
//A PARTIR DE ESTE OVERRIDE AGREGAMOS BANDA DE SETTERS Y GETTERS

    @Override
    public void setCilindrada(int cilindrada) {
        super.setCilindrada(cilindrada); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCilindrada() {
        return super.getCilindrada(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMarca() {
        return super.getMarca(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPatente(String patente) {
        super.setPatente(patente); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPatente() {
        return super.getPatente(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setFechaexamen(String fechaexamen) {
        super.setFechaexamen(fechaexamen); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getFechaexamen() {
        return super.getFechaexamen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setFechanacimiento(String fechanacimiento) {
        super.setFechanacimiento(fechanacimiento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getFechanacimiento() {
        return super.getFechanacimiento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDNI(String DNI) {
        super.setDNI(DNI); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDNI() {
        return super.getDNI(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombresApellido(String NombresApellido) {
        super.setNombresApellido(NombresApellido); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombresApellido() {
        return super.getNombresApellido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
    
//a partir de ACA ESTABA ANTES
    
    
    
    
    
    
    @Override
    public void setCircuitofaltas(int circuitofaltas) {
        super.setCircuitofaltas(circuitofaltas); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCircuitofaltas() {
        return super.getCircuitofaltas(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCircuitotiempo(double circuitotiempo) {
        super.setCircuitotiempo(circuitotiempo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getCircuitotiempo() {
        return super.getCircuitotiempo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "ExamenAuto{" + "faltasCometidas=" + faltasCometidas + ", tiempoUtilizado=" + tiempoUtilizado + ", cantidadpuertas=" + cantidadpuertas + '}';
    }

    
    
   

public boolean AprobadoAuto(){
return (this.getCircuitofaltas() <= 2 && this.getCircuitotiempo() <= 29);
}
   
    
    
}
