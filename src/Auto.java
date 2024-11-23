import java.util.List;

public class Auto {

    //Atributos (caracteristicas)
    private Long id;
    private String marca;
    private String modelo;
    //Se hace la relación depende del contexto mas si es 1 A 1
    //Auto tendra muchos propietarios
    //Se crea como atributo para hacer la relación
            //Relacion 1 A N (uno a muchos)
    //Se crea una coleccion (lista de objetos propietario)
    private List<Propietario> listaPropietarios;


    //Constructores
    public Auto(){

    }
    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }
    //Métodos getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public List<Propietario> getListaPropietarios(){
        return listaPropietarios;
    }
    public void setListaPropietarios(List<Propietario> listaPropietarios){
        this.listaPropietarios = listaPropietarios;

    }
    //Sobrescritura del método toString para el resultado de mostrar los valores (lista de objetos) del arreglo de los propietarios por auto
    /*@Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", listaPropietarios=" + listaPropietarios + '}';
    }
    */
}

// RELACION 1 A 1 (uno a uno)
/*
Para hacer la relacion 1 a 1 se llama al objeto de la clase (propietario) a la otra clase (auto)
//Atributos (caracteristicas)
private Long id;
private String marca;
private String modelo;
//Se hace la relación depende del contexto mas si es 1 A 1
//Auto tendra un propietario
//Se crea como atributo
//Para hacer la relación
//Relacion 1 A 1
private Propietario propietario;


//Constructores
public Auto(){

}
public Auto(Long id, String marca, String modelo, Propietario propietario){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.propietario = propietario;
}
//Métodos getters and setters
public Long getId(){
    return id;
}
public void setId(Long id){
    this.id = id;
}

public String getMarca(){
    return marca;
}

public void setMarca(String marca){
    this.marca = marca;
}

public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public Propietario getPropietario(){
    return propietario;
}
public void setPropietario(Propietario propietario){
    this.propietario = propietario;

}
*/




/*
Para la relacion 1 a N (uno a muchos), ejemplo en bd se hace por medio de la foreing key, en la logica
es del lado del 1 (auto) muchos (propietarios) es por medio de una colección (coleccion de objetos)
 (un objeto auto tenga una colección de propietarios) (un objeto tenga muchos objetos)


    //Atributos (caracteristicas)
    private Long id;
    private String marca;
    private String modelo;
    //Se hace la relación depende del contexto mas si es 1 A 1
    //Auto tendra muchos propietarios
    //Se crea como atributo para hacer la relación
            //Relacion 1 A N (uno a muchos)
    //Se crea una coleccion (lista de objetos propietario)
    private List<Propietario> listaPropietarios;


    //Constructores
    public Auto(){

    }
    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }
    //Métodos getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public List<Propietario> getListaPropietarios(){
        return listaPropietarios;
    }
    public void setListaPropietarios(List<Propietario> listaPropietarios){
        this.listaPropietarios = listaPropietarios;

    }

*/