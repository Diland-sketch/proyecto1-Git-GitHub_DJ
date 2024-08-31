public class NoPedecederos extends Producto{
    private String marca;

    public NoPedecederos(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "marca='" + marca + '\'' +
                '}';
    }
}
