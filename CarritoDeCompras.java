import java.util.*;

/**
 * Gestiona la colección de ítems y cálculos del carrito.
 */
public class CarritoDeCompras {
    // Punto 9: Escalabilidad (Usar Map permite acceso O(1) por nombre)
    private Map<String, Item> items = new LinkedHashMap<>();
    
    // Punto 7: Hiperparámetros
    private static final String SIMBOLO_MONEDA = "€";
    private static final String CABECERA = "--- Detalles del Carrito ---";

    public void agregarItem(Item item) {
        items.put(item.getNombre(), item);
    }

    public void removerItem(String nombreItem) throws NoSuchElementException {
        // Punto 6: Manejo de excepciones
        if (!items.containsKey(nombreItem)) {
            throw new NoSuchElementException("El ítem no existe en el carrito.");
        }
        items.remove(nombreItem);
    }

    // Punto 2: El cálculo es responsabilidad del carrito
    public double calcularTotal() {
        return items.values().stream()
                    .mapToDouble(i -> i.getPrecio() * i.getCantidad())
                    .sum();
    }

    public void imprimirDetalle() {
        System.out.println(CABECERA);
        // Punto 5: Evitar duplicación usando el toString de Item
        items.values().forEach(System.out::println);
        System.out.println("Total: " + calcularTotal() + " " + SIMBOLO_MONEDA);
    }
}