
package TP1.PBA;


public class ExamenMoto extends Vehiculo {
    private final int faltaspermitidasmoto=4;
    private final int tiempopermitidomoto=20;
    private boolean todoslosespejos;

    public ExamenMoto(boolean todoslosespejos, String patente, String marca, int cilindrada, String NombresApellido, String DNI, String fechanacimiento, String fechaexamen, double circuitotiempo, int circuitofaltas) {
        super(patente, marca, cilindrada, NombresApellido, DNI, fechanacimiento, fechaexamen, circuitotiempo, circuitofaltas);
        this.todoslosespejos = todoslosespejos;
    }

    public boolean isTodoslosespejos() {
        return todoslosespejos;
    }

    public void setTodoslosespejos(boolean todoslosespejos) {
        this.todoslosespejos = todoslosespejos;
    }

    @Override
    public String toString() {
        return "ExamenMoto{" + "faltaspermitidasmoto=" + faltaspermitidasmoto + ", tiempopermitidomoto=" + tiempopermitidomoto + ", todoslosespejos=" + todoslosespejos + '}';
    }

 
}
