import java.util.ArrayList;
import java.util.List;
public class Venta {

    String titulo;
    private Cliente cliente;                     // Una venta tiene los datos del cliente, por eso utilizamos
                                                // la clase Cliente , para asociar sus valores y acceder
                                                // a sus datos
     // private List<DetalleVenta> detalle;       // Importar la lista

    List<DetalleVenta> detalle = new ArrayList<>();
    // Utilizando Array List para crear la lista e importar los datos
    // detalle existe y puede almacenar objetos de DetalleVenta
    // ALMACENA OBJETOS

    // Este void no devuelve nada , solo funciona para añadir un bojeto a la lista
    void agregarDetalle(DetalleVenta d){
        detalle.add(d);
    }

}
