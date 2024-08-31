public class Vendedor extends Persona{

    private double sueldo;

    public Vendedor(String nombre, String apellido, int identifacion, double sueldo) {
        super(nombre, apellido, identifacion);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sueldo = " + sueldo;
    }
}
