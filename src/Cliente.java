public class Cliente extends Persona {

    private double saldoPendiete;
    private String password;

    public Cliente(String nombre, String apellido, int identifacion, double saldoPendiete) {
        super(nombre, apellido, identifacion);
        this.saldoPendiete = saldoPendiete;
    }

    public double getSaldoPendiete() {
        return saldoPendiete;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSaldoPendiete = " + saldoPendiete;
    }
}
