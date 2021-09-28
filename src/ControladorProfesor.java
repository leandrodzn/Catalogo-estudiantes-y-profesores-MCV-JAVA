import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorProfesor {
    
    private ArrayList <Profesor> profList;

    Scanner reader;

    VistaProfesor vista; 

    ControladorProfesor(VistaProfesor vista){
        profList = new ArrayList<Profesor>();
        this.vista = vista;
    }
    

   /*Prueba*/ public Integer ingresarClaveEmpleado(){ //Ingreso de matrícula por primera vez

        reader = new Scanner(System.in);
        int flag = 1;
        int result = 0;
        do {
            System.out.print("Ingrese la matrícula del estudiante: ");
            int matricula = reader.nextInt();

            for (int i = 0; i < profList.size(); i++) {
                if(profList.get(i).getClaveEmpleado() == matricula){
                    System.out.println("Matrícula ya existente. Inténtelo de nuevo");
                    flag = 0;
                    result = 0;
                }else{
                    result = matricula;
                }
            }
        } while (flag != 1);


        return result;
    }

    /*public String ingresarNombre(){ // Ingresar nombre 

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
    }*/


    public void addProfesor() throws IOException{ // Agregar profesores con atributos
        profList.add(0, new Profesor(vista.ingresarNombre(), vista.ingresarEdad(), vista.ingresarClaveEmpleado(), vista.pedirSalario()));
    }    
    
    /*public Estudiante ListaEstudiantes(){ // Imprimir toda la lista de estudiantes

        for (int i = 0; i < estList.size();) {
            //System.out.println("El estudiante "+ estList.get(j).getNombre() + " con matrícula " + estList.get(j).getMatricula() + " su calificación es " + estList.get(j).getCalificacion());
            //estList.get(j).imprimirDatos(); //Impresión con el método imprimirDatos() en la clase Estudiante

            return estList.get(i); //imprimir con el toString() en clase Estudiante
        }
        return null;

    }*/

    
    /* public Integer pedirMatricula(){ // Para buscar matrícula en el ArrayList
        reader = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del estudiante: ");

        return reader.nextInt();
    } */

    public int obtProfesorPorClave(int busquedaClave){ // Buscar profesor en el ArrayList

        int posicion = -1;
        for (int i = 0; i < profList.size(); i++) {
            if (profList.get(i).getClaveEmpleado() == busquedaClave) {
                    return i;
            }
        }
       // System.out.println(posicion);
        return posicion;
    }

    
    public Profesor informacionProfesor(int posicion){ // Mostrar información de un profesor por matrícula

        if (posicion != -1) {
            return profList.get(posicion);
        }
        return null;

    } 

     
    public int borrarProfesor(int posicion){ // Borrar a un profesor por matrícula
       if (posicion != -1) {
        vista.imprimirInfoProfesor(profList.get(posicion));
        profList.remove(profList.get(posicion));
        return 1;
        // return;
       } 
       return 0;
    }

  
    public Estudiante modificarNombreProfesor(int posicion){ // Modificar el nombre de un profesor

        if(posicion != -1){

            vista.imprimirInfoProfesor(informacionProfesor(posicion));
           
            profList.get(posicion).setNombre(vista.ingresarNombre());
            return profList.get(posicion);
            
        }
        return null;
    }

    public Estudiante modificarEdadProfesor(int posicion){ // Modificar la edad de un profesor

        if(posicion != -1){

            vista.imprimirInfoProfesor(informacionProfesor(posicion));

            profList.get(posicion).setEdad(vista.ingresarEdad());
            return profList.get(posicion);

        }
        return null;
    }

    public Estudiante modificarSalarioProfesor(int posicion){ // Modificar la calificacion de un profesor

        if(posicion != -1){

            vista.imprimirInfoProfesor(informacionProfesor(posicion));
           
            profList.get(posicion).setSalario(vista.ingresarSalario());
            return profList.get(posicion);
            
        }
        return null;
    }


    public void menuModificarProfesor(){ // Menú de la opción de modificar atributos de un estudiante
        int opcion = 0;

        while (opcion != 4) {
            
            switch (vista.menuEleccionModificarProfesor()) {

                case 1: vista.imprimirModificacionNombre(modificarNombreProfesor(obtProfesorPorClave(vista.pedirClave())));
                    break;
    
                case 2: vista.imprimirModificacionEdad(modificarEdadProfesor(obtProfesorPorClave(vista.pedirClave())));
                    break;
    
                case 3: vista.imprimirModificacionSalario(modificarSalarioProfesor(obtProfesorPorClave(vista.pedirClave())));
                    break;

                case 4: opcion = 4;
                    break;

                default: vista.mensajeOpcionDesconocida();
                break;

            }

        }
    } 

    public void menuProfesor() throws IOException{
        Integer opcion = 0;

        while (opcion != 6) {

            switch (vista.menu()) {

                case 1: System.out.println();
                    addProfesor();
                    break;
                
                case 2: System.out.println();
                    vista.imprimirListaProfesores(profList);
                    break;

                case 3:  System.out.println();
                    Integer aux;
                    aux = vista.pedirClave();
                    vista.imprimirInfoProfesor(informacionProfesor(obtProfesorPorClave(aux)));
                    break;

                case 4: System.out.println();
                    aux = vista.pedirClave();
                    vista.notificacionBorradoProfesor(borrarProfesor(obtProfesorPorClave(aux)));
                    break;

                case 5: menuModificarProfesor();
                    break;

                case 6: opcion = 6;
                    break;

                default: vista.mensajeOpcionDesconocida();
            }
            
        }
    }

}
