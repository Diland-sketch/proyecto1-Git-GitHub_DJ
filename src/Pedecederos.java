public class Pedecederos extends Producto {
    private String marca;
    private String tipo;
    private String caducidad;

    public Pedecederos(String nombre, double precio, String marca, String tipo, String caducidad) {
        super(nombre, precio);
        this.marca = marca;
        this.tipo = tipo;
        this.caducidad = caducidad;

    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCaducidad() {
        return caducidad;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMarca='" + marca +
                "\nTipo='" + tipo +
                "\nCaducidad='" + caducidad ;
    }
}
