public class Limpieza extends Producto{
    private String marca;
    private int capacidad;

    public Limpieza(String nombre, double precio, String marca, int capacidad) {
        super(nombre, precio);
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
