import java.util.ArrayList;
import java.util.Scanner;

public class VistaEstudiante {

    Scanner reader;

    public String ingresarNombre(){ // Ingresar nombre 

        reader = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        reader.useDelimiter("\n");
        return reader.nextLine();
    }

    public Double ingresarCalificacion(){ //Ingresar calificación
        reader = new Scanner(System.in);
        System.out.print("Ingrese la calificación del estudiante: ");
        return reader.nextDouble();
    }

    public Integer ingresarEdad(){ // Ingresar edad
        reader = new Scanner(System.in);
        System.out.print("Ingrese la edad del estudiante: ");
        return reader.nextInt();
    }

    public Integer pedirMatricula(){ // Para buscar matrícula en el ArrayList
        reader = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del estudiante: ");

        return reader.nextInt();
    }

    
    public void imprimirInfoEstudiante(Estudiante obj1){ //Impresión de información de estudiante
        if (obj1 != null) {
            System.out.println("- Estudiante encontrado -");
            System.out.println(obj1);
            
        }else{
            System.out.println("- Estudiante no encontrado -");
        }
    }

    public void notificacionBorradoEstudiante(int flag){ // Estudiante borrado

        if (flag == 1) {
            System.out.println("- Estudiante borrado -");
        } else{
            System.out.println("- Estudiante no encontrado -");
        }
    }

    public void imprimirListaEstudiantes(ArrayList<Estudiante> estudiantes){ // Impresión de todos los estudiantes
        estudiantes.forEach(System.out::println);
    }

   
    public void imprimirModificacionNombre(Estudiante obj1){ // Notificación modificación de nombre de estudiante

        if(obj1 != null){
            System.out.println();
            System.out.println("- Nombre de estudiante modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Estudiante no modificado -");
        }
    }

    public void imprimirModificacionEdad(Estudiante obj1){ // Notificación modificación de edad de estudiante

        if(obj1 != null){
            System.out.println();
            System.out.println("- Edad de estudiante modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Estudiante no modificado -");
        }
    }

    public void imprimirModificacionCalificacion(Estudiante obj1){ // Notificación modificación de calificación de estudiante

        if(obj1 != null){
            System.out.println();
            System.out.println("- Calificación de estudiante modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Estudiante no modificado -");
        }
    }
   
    
    public void mensajeOpcionDesconocida(){
        System.out.println("- Opción no reconocida. Inténtelo de nuevo -");
    }
   
    
    public Integer menuEleccionModificarEstudiante(){ // Menú de la opción de modificar atributos de un estudiante

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("- Modificar estudiante -");

        System.out.println("[1] Modificar nombre de estudiante");
        System.out.println("[2] Modificar edad de estudiante");
        System.out.println("[3] Modificar calificación de estudiante");
        System.out.println("[4] Regresar al menú de estudiante");
        System.out.print("Opción: ");

        return reader.nextInt();
    }


    
    public Integer menuEstudiante(){ // Menú de estudiante

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("---- Menú de estudiante ----");

        System.out.println("[1] Agregar estudiante");
        System.out.println("[2] Desplegar lista de estudiantes");
        System.out.println("[3] Desplegar información de estudiante");
        System.out.println("[4] Borrar información de estudiante");
        System.out.println("[5] Modificar información de estudiante");
        System.out.println("[6] Regresar a menú principal");
        System.out.print("Opción: ");

        return reader.nextInt();

    }


}
