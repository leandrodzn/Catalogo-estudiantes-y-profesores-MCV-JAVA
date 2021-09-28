public class Profesor extends Persona{
    private Integer claveEmpleado;
    private Double salario;

    public Profesor(String nombre, Integer edad, Integer claveEmpleado, Double salario){
        super(nombre, edad);
        this.claveEmpleado = claveEmpleado;
        this.salario = salario;
    }

    public void setClaveEmpleado(Integer claveEmpleado){
        this.claveEmpleado = claveEmpleado;
    }

    public Integer getClaveEmpleado() {
        return this.claveEmpleado;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return this.salario;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "; Edad: " + getEdad() + "; Clave de empleado: " + getClaveEmpleado() + "; Salario: " + getSalario();
    }
}