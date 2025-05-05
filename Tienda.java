public class Tienda {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        try {
            Item item1 = new Item("Camiseta",  20.99);
            Item item2 = new Item("Pantalones", 34.99);
            carrito.agregarItem(item1);
            carrito.agregarItem(item2);
            //carrito.imprimirDetalle();    
            System.out.println(carrito);
        } catch (Exception e) {
            System.out.println("Algo ha ido mal");
        }
        
    }
}
