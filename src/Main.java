import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Relación 1 A N

        //Creacion del objeto auto
        Auto auto1 = new Auto();

        //Seteo de los valores de los atributos del auto
        auto1.setId(1L);
        auto1.setMarca("Renault");
        auto1.setModelo("Duster");

        //Creación del Arraylist para los propietarios por auto (colección de objetos)
        List<Propietario> listaPropietarios1 = new ArrayList<Propietario>();

        //Creación de los objetos propietarios que iran dentro de la lista
        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();
        Propietario propietario3 = new Propietario();

        //Seteo de los valores de los atributos de los propietarios
        propietario1.setId(1L);
        propietario1.setNombre("Orlando");
        propietario1.setApellido("Paredes Cano");

        propietario2.setId(2L);
        propietario2.setNombre("Jose");
        propietario2.setApellido("Paredes Quinto");

        propietario3.setId(3L);
        propietario3.setNombre("Maria");
        propietario3.setApellido("Cano Monroy");

        //Introducción de los objetos propietarios a la lista por medio del metodo add
        listaPropietarios1.add(propietario1);
        listaPropietarios1.add(propietario2);
        listaPropietarios1.add(propietario3);

        //Seteo de la lista de los propietarios al objeto auto
        auto1.setListaPropietarios(listaPropietarios1);

        //Mostrar los valores del objeto auto y su lista de objetos propietarios del auto
        System.out.println("El auto" + auto1.getMarca() + " " + auto1.getModelo() + " tiene como propietarios a: " + auto1.getListaPropietarios().toString());

    }
}

/*
RELACIONES ENTRE CLASES:
    -Las clases de un programa deben tener una relacion para tener funcionalidades entre ellas.

     Relación 1 A 1:
        -Un objeto de una clase puede relacionarse solo con uno de otra clase.
     Relación 1 A N:
        -Un objeto de una clase puede relacionarse con muchos de otra clase.
     Relación N A 1:
        -Muchos objetos de una clase pueden reacionarse a solo 1 objeto de otra clase.
     Realción N A N:
        -Muchos objetos de una clase pueden relacionarse con muchos objetos de otra clase.

*/