/**
 * La clase Item representa un artículo con un nombre y un precio.
 * Proporciona validación para asegurarse de que el precio esté dentro de un rango permitido.
 */
class Item {

    /**
     * Precio máximo permitido para un artículo.
     */
    private static final double MAX_PRECIO = 10000.0;

    /**
     * Nombre del artículo.
     */
    private String nombre;

    /**
     * Precio del artículo.
     */
    private double precio;

    /**
     * Constructor de la clase Item.
     *
     * @param nombre El nombre del artículo.
     * @param precio El precio del artículo. Debe estar entre 0 y {@link #MAX_PRECIO}.
     * @throws IllegalArgumentException Si el precio está fuera del rango permitido.
     */
    public Item(String nombre, double precio) {
        setNombre(nombre); // Usar el setter para validar el nombre
        setPrecio(precio); // Usar el setter para validar el precio
    }

    /**
     * Obtiene el nombre del artículo.
     *
     * @return El nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del artículo.
     *
     * @param nombre El nombre del artículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del artículo.
     *
     * @return El precio del artículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del artículo.
     *
     * @param precio El precio del artículo. Debe estar entre 0 y {@link #MAX_PRECIO}.
     * @throws IllegalArgumentException Si el precio está fuera del rango permitido.
     */
    public void setPrecio(double precio) throws IllegalArgumentException {
        if (precio < 0 || precio > MAX_PRECIO) {
            throw new IllegalArgumentException("Precio incorrecto");
        }
        this.precio = precio;
    }
}