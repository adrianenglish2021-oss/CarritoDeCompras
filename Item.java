/**
 * Representa un producto individual en el carrito.
 */
public class Item {
    private String nombre;
    private double precio;
    private int cantidad; // Punto 10: Agregar cantidad

    // Constantes (Punto 7)
    private static final double PRECIO_MAXIMO = 10000.0;

    public Item(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    // Getters y Setters con validación (Punto 4)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio < 0 || precio > PRECIO_MAXIMO) {
            throw new IllegalArgumentException("Precio fuera de límites permitidos.");
        }
        this.precio = precio;
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        this.cantidad = cantidad;
    }

    // Sobreescritura de toString (Punto 8)
    @Override
    public String toString() {
        return String.format("%s - %d x $%.2f", nombre, cantidad, precio);
    }
}