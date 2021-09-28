import java.util.ArrayList;
import java.util.Scanner;

public class VistaProfesor {

    Scanner reader;

    public String ingresarNombre(){ // Ingresar nombre 

        reader = new Scanner(System.in);
        System.out.print("Ingrese el nombre del profesor: ");
        reader.useDelimiter("\n");
        return reader.nextLine();
    }

    public Double ingresarSalario(){ //Ingresar salario
        reader = new Scanner(System.in);
        System.out.print("Ingrese el salario del profesor: ");
        return reader.nextDouble();
    }

    public Integer ingresarEdad(){ // Ingresar edad
        reader = new Scanner(System.in);
        System.out.print("Ingrese la edad del profesor: ");
        return reader.nextInt();
    }

    public Integer pedirClave(){ // Para buscar clave de empleado en el ArrayList
        reader = new Scanner(System.in);
        System.out.print("Ingrese la clave de empleado del profesor: ");

        return reader.nextInt();
    }

    
    public void imprimirInfoProfesor(Estudiante obj1){ //Impresión de información de profesor
        if (obj1 != null) {
            System.out.println("- Profesor encontrado -");
            System.out.println(obj1);
            
        }else{
            System.out.println("- Profesor no encontrado -");
        }
    }

    public void notificacionBorradoProfesor(int flag){ // Profesor borrado

        if (flag == 1) {
            System.out.println("- Profesor borrado -");
        } else{
            System.out.println("- Profesor no encontrado -");
        }
    }

    public void imprimirListaProfesores(ArrayList<Profesor> profesores){ // Impresión de todos los profesores
        profesores.forEach(System.out::println);
    }

   
    public void imprimirModificacionNombre(Profesor obj1){ // Notificación modificación de nombre de profesor

        if(obj1 != null){
            System.out.println();
            System.out.println("- Nombre de profesor modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Profesor no modificado -");
        }
    }

    public void imprimirModificacionEdad(Profesor obj1){ // Notificación modificación de edad de profesor

        if(obj1 != null){
            System.out.println();
            System.out.println("- Edad de profesor modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Profesor no modificado -");
        }
    }

    public void imprimirModificacionSalario(Profesor obj1){ // Notificación modificación de salario de profesor

        if(obj1 != null){
            System.out.println();
            System.out.println("- Salario de profesor modificado");
            System.out.println(obj1);
        }else{
            System.out.println("- Profesor no modificado -");
        }
    }
   
    
    public void mensajeOpcionDesconocida(){
        System.out.println("- Opción no reconocida. Inténtelo de nuevo -");
    }
   
    
    public Integer menuEleccionModificarProfesor(){ // Menú de la opción de modificar atributos de un profesor

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("- Modificar profesor -");

        System.out.println("[1] Modificar nombre de profesor");
        System.out.println("[2] Modificar edad de profesor");
        System.out.println("[3] Modificar salario de profesor");
        System.out.println("[4] Regresar al menú principal");
        System.out.print("Opción: ");

        return reader.nextInt();
    }


    
    public Integer menu(){ // Menú de estudiante

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("---- Menú de profesor ----");

        System.out.println("[1] Agregar profesor");
        System.out.println("[2] Desplegar lista de profesores");
        System.out.println("[3] Desplegar información de profesor");
        System.out.println("[4] Borrar información de profesor");
        System.out.println("[5] Modificar información de profesor");
        System.out.println("[6] Regresar a menú principal");
        System.out.print("Opción: ");

        return reader.nextInt();

    }


}