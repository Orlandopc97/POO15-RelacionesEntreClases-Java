public class Propietario {

    //Atributos (caracteristicas)
    private Long id;
    private String nombre;
    private String apellido;


    //Constructores
    public Propietario (){

    }
    public Propietario(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Métodos getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //Sobrescritura del método toString para el resultado de mostrar los valores (caracteristicas) del propietario
    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + '}';
    }
}
