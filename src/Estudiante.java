//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

public class Estudiante {
    //atributos
    private String nombre; //private = más seguridad
    private Double calificacion;
    private Integer edad;
    private Integer matricula;

    //métodos

    ///constructores

    Estudiante(){}   

    Estudiante(String nombre, Double calificacion, Integer edad, Integer matricula){
        setNombre(nombre); //setNombre(nombre)
        setCalificacion(calificacion); // this.calificacion = calificacion;
        setEdad(edad);
        setMatricula(matricula);
    }


    ///setter y getter 
    // el set es para entrada
    // el get es para salida

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCalificacion(Double calificacion){
        this.calificacion = calificacion;
    }

    public Double getCalificacion(){
        return this.calificacion;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

    public Integer getEdad(){
        return this.edad;
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
