public class elEjecutor {

    public static void main() {
        System.out.println("***********OBJETOS ******");

 // CLIENTES
        System.out.println("***********  CLIENTES  ******"+ "\n");
        Cliente cliente1 = new Cliente(); // ahora podemos trabajar con la variable "cliente1"
        // tambien puede ser
        var cliente2 = new Cliente();

        cliente1.nombre = "Sebastían Perez";
        cliente1.puntos= 980;
        cliente1.dni= 75345685;
        cliente1.telefono= 952325248;

        cliente1.ValoresCliente();



// PRDUCTOS
        System.out.println("***********  PRODUCTOS  ******"+ "\n");
        Producto producto1 = new Producto();
        var p2 = new Producto();

        producto1.categoria= "Herramientas";
        producto1.nombreProducto = "Alicate";
        producto1.codigoProducto = "HA1";
        producto1.pesoProducto = 230;
        producto1.precio = 6.50;

        p2.categoria= "Algodones";
        p2.nombreProducto= "Almohada";
        p2.codigoProducto= "A1";
        p2.pesoProducto= 175;
        p2.precio = 10.00;

        System.out.println(producto1.categoria+ "\n"
                + producto1.nombreProducto+ "\n"
                +producto1.codigoProducto + "\n"
                +producto1.pesoProducto+ "\n"
                +producto1.precio);
        System.out.println(p2.categoria + "\n"
                + p2.nombreProducto+"\n"
                +p2.codigoProducto+ "\n"
                +  p2.pesoProducto+"\n"
                +p2.precio );



// DETALLE VENTAS
        System.out.println("***********  DETALLE VENTAS  ******"+ "\n");
        DetalleVenta det1 = new DetalleVenta();
        var det2 = new DetalleVenta();


        det1.cantidad = 5;
        det1.producto = producto1; // Asignamos el valor de det1 = p1 de esta manera
        det1.SubTotal();
        System.out.println("Subtotal: " + det1.SubTotal());

        det2.cantidad=10;
        det2.producto= p2; // producto es el punete de darle valores al precio en los detalles
        det2.SubTotal();
        System.out.println("Subtotal:" + det2.SubTotal());

// VENTAS
        System.out.println("***********  VENTAS  ******" + "\n");
        Venta ven1= new Venta();
        var ven2 = new Venta();

        ven1.agregarDetalle(det1);
        ven1.agregarDetalle(det2);


        System.out.println("Detalles agregados a la venta: " + ven1.detalle.size());

        for (DetalleVenta d : ven1.detalle) {
            System.out.println(d.producto.nombreProducto);
        }
    }
}
