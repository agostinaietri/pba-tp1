
package TP1.PBA;


public abstract class Examen {
    
    private String NombresApellido;
    private String DNI;
    private String fechanacimiento;
    private String fechaexamen;
    
    private double circuitotiempo;
    private int circuitofaltas;

    public Examen(String NombresApellido, String DNI, String fechanacimiento, String fechaexamen, double circuitotiempo, int circuitofaltas) {
        this.NombresApellido = NombresApellido;
        this.DNI = DNI;
        this.fechanacimiento = fechanacimiento;
        this.fechaexamen = fechaexamen;
        this.circuitotiempo = circuitotiempo;
        this.circuitofaltas = circuitofaltas;
    }

    public String getNombresApellido() {
        return NombresApellido;
    }

    public void setNombresApellido(String NombresApellido) {
        this.NombresApellido = NombresApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getFechaexamen() {
        return fechaexamen;
    }

    public void setFechaexamen(String fechaexamen) {
        this.fechaexamen = fechaexamen;
    }

    public double getCircuitotiempo() {
        return circuitotiempo;
    }

    public void setCircuitotiempo(double circuitotiempo) {
        this.circuitotiempo = circuitotiempo;
    }

    public int getCircuitofaltas() {
        return circuitofaltas;
    }

    public void setCircuitofaltas(int circuitofaltas) {
        this.circuitofaltas = circuitofaltas;
    }

    @Override
    public String toString() {
        return "Examen{" + "NombresApellido=" + NombresApellido + ", DNI=" + DNI + ", fechanacimiento=" + fechanacimiento + ", fechaexamen=" + fechaexamen + ", circuitotiempo=" + circuitotiempo + ", circuitofaltas=" + circuitofaltas + '}';
    }

    
   

    

  

    
    
    
}
