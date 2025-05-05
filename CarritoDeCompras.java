import java.util.ArrayList;
import java.util.List;
public class CarritoDeCompras {
    final String CURRENCY_SYMBOL = "$";
    final String LIST_HEADER = "Detalles del carrito de compras";
    final String TOTAL_HEADER = "Total: ";

    private List<Item> items;
    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }
    public void agregarItem(Item item) {
        items.add(item);
    }
    public void removerItem(Item item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder();
        detalle.append(LIST_HEADER).append("\n");
        double total = 0;
        for (Item item : items) {
            detalle.append(item.getNombre())
                   .append(": ")
                   .append(CURRENCY_SYMBOL)
                   .append(item.getPrecio())
                   .append("\n");
            total += item.getPrecio();
        }
        detalle.append(TOTAL_HEADER)
               .append(CURRENCY_SYMBOL)
               .append(String.format("%.2f", total));
        return detalle.toString();
    }
    
}
