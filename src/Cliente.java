public class Cliente {

    int dni ;
    String nombre;
    int telefono;
    int puntos;

    // metodos , solo imprime los valores

    void nombreCliente(){
        System.out.println("El nombre del cliente es "+nombre );
    }
    void dniNumero(){
        System.out.println("El dni del cliente es :" + dni);
    }
    void telefonoNumero(){
        System.out.println("El telefono del Cliente es :" + telefono);

    }
    void puntosBonus(){
        //System.out.println("Bonus del cliente :" + puntos);


    }


    // METODO EN DONDE ME DEN TODOS LOS VALORES
    void ValoresCliente(){
        System.out.println( "/*/*/*Detalles del Cliente/*/*/*"
                +"\nNombre Cliente: " + nombre+
                "\nDNI Cliente:" + dni +
                "\nTelefono: " + telefono+
                "\n" +
                        "Puntos: " + puntos);
        System.out.println(" Tiburonsin BUAJAJA");
    }



    // LOS ATRIBUTOS AUN NO TIENEN VALORES, TENDRAN VALORES CUANDO SE CREEN LOS OBJETOS

    // CREAR LOS OBJETOS DESDE OTRO ARCHIVO ES BUEN PRACTICA

}



