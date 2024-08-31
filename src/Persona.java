public class Persona {

    private String nombre;
    private String apellido;
    private int identifacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int identifacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identifacion = identifacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdentifacion() {
        return identifacion;
    }

    @Override
    public String toString() {
        return "\nNombre = '" + nombre +
                "\nApellido = '" + apellido +
                "\nIdentifacion = " + identifacion;
    }
}
