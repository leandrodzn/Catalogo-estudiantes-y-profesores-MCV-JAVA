//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

public class Estudiante extends Persona{
    //atributos
    //private String nombre; //private = más seguridad
    private Double calificacion;
    //private Integer edad;
    private Integer matricula;

    //métodos

    ///constructores

    Estudiante(){}   

    Estudiante(String nombre, Double calificacion, Integer edad, Integer matricula){
        super(nombre, edad);
        setCalificacion(calificacion); // this.calificacion = calificacion;
        setMatricula(matricula);
    }


    ///setter y getter 
    // el set es para entrada
    // el get es para salida


    public void setCalificacion(Double calificacion){
        this.calificacion = calificacion;
    }

    public Double getCalificacion(){
        return this.calificacion;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }

    public Integer getMatricula(){
        return this.matricula;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+ this.nombre +"; Edad: "+ this.edad + "; Calificación: " + this.calificacion + "; Matrícula: " + this.matricula);
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "; Edad: " + getEdad() + "; Calificación: " + getCalificacion() + "; Matrícula: " + getMatricula();
    }
}
