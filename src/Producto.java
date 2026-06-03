public class Producto {
    // ATRIBUTOS
    String nombreProducto;
    double pesoProducto;
    double precio;
    String codigoProducto;
    String categoria;

    // METODOS

    void nomProduc(){
        System.out.println("Producto: " + nombreProducto);
    }
    void pesoProduc(){
        System.out.println("Peso: " + pesoProducto);
    }
    void precioProducto(){
        System.out.println("Precio: " + precio);
    }
    void codigoProduc(){
        System.out.println("Codigo: "+ codigoProducto);
    }
    void categoriaProduc(){
        System.out.println("Categoria: " + categoria);
    }

    // OBJETOS
}
