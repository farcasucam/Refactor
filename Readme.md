# Carrito de Compras

Este proyecto es una implementación básica de un sistema de carrito de compras en Java. Permite agregar y remover artículos, así como mostrar un resumen detallado del contenido del carrito y el costo total.

## Estructura del Proyecto

El proyecto consta de tres clases principales:

### 1. `CarritoDeCompras`
Esta clase representa el carrito de compras y contiene las siguientes funcionalidades:
- **Agregar artículos**: Permite añadir instancias de la clase `Item` al carrito.
- **Remover artículos**: Permite eliminar artículos del carrito.
- **Mostrar detalles**: Genera un resumen del contenido del carrito, incluyendo el nombre de cada artículo, su precio y el costo total.

### 2. `Item`
Esta clase representa un artículo que puede ser añadido al carrito. Contiene:
- **Atributos**:
  - `nombre`: El nombre del artículo.
  - `precio`: El precio del artículo, que debe estar entre 0 y un valor máximo definido.
- **Validación**: Se asegura de que el precio esté dentro de un rango permitido.
- **Métodos**:
  - Getters y setters para los atributos `nombre` y `precio`.

### 3. `Tienda`
Esta clase contiene el método `main` y actúa como punto de entrada del programa. Simula el uso del carrito de compras al:
- Crear instancias de `Item`.
- Agregar artículos al carrito.
- Mostrar el contenido del carrito en la consola.

## Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

1. Compila las clases:
   ```bash
   javac Item.java CarritoDeCompras.java Tienda.java