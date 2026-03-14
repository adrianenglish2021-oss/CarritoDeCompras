public class Main {
    public static void main(String[] args) {
        try {
            CarritoDeCompras carrito = new CarritoDeCompras();
            
            Item item1 = new Item("Camiseta", 20.99, 2);
            Item item2 = new Item("Pantalones", 34.99, 1);
            
            carrito.agregarItem(item1);
            carrito.agregarItem(item2);
            
            carrito.imprimirDetalle();
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}