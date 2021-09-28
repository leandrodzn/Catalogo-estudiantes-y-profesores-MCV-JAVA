public class Persona {
    protected String nombre;
    protected Integer edad;

    public Persona(){}

    public Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }
}
