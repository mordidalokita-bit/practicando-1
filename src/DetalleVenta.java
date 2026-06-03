public class DetalleVenta {
    // Codigo de producto, precio , nombre de producto , peso de producto,
    // categoria

    int cantidad;
    double subTotal;
    Producto producto ;// Como ya hemos creado el objeto de Producto p1 en el ejecutor

    // Podemos utilizarlo en los metodos de otras clases

    void mostrarDetalle(){
        System.out.println("Nombre del producto es: "+ producto.nombreProducto);

    }

    double SubTotal(){
        return cantidad*producto.precio;

    }
}
