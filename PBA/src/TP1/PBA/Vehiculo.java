
package TP1.PBA;


public class Vehiculo extends Examen {
    private String patente;
    private String marca;
    private int cilindrada;

    public Vehiculo(String patente, String marca, int cilindrada, String NombresApellido, String DNI, String fechanacimiento, String fechaexamen, double circuitotiempo, int circuitofaltas) {
        super(NombresApellido, DNI, fechanacimiento, fechaexamen, circuitotiempo, circuitofaltas);
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    
    //--------------------------------------------------------

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
    
    
    
    
    
//--------------------------------------------------------------
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", cilindrada=" + cilindrada + '}';
    }

    
  
    
}
