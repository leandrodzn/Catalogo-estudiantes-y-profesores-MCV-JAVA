import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorEstudiante {

    private ArrayList <Estudiante> estList;

    Scanner reader;

    VistaEstudiante vista; 

    ControladorEstudiante(VistaEstudiante vista){
        estList = new ArrayList<Estudiante>();
        this.vista = vista;
    }
    

   /*Prueba*/ public Integer ingresarMatricula(){ //Ingreso de matrícula por primera vez

        reader = new Scanner(System.in);
        int flag = 1;
        int result = 0;
        do {
            System.out.print("Ingrese la matrícula del estudiante: ");
            int matricula = reader.nextInt();

            for (int i = 0; i < estList.size(); i++) {
                if(estList.get(i).getMatricula() == matricula){
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


    public void addEstudiante() throws IOException{ // Agregar estudiantes con atributos
        estList.add(0, new Estudiante(vista.ingresarNombre(), vista.ingresarCalificacion(), vista.ingresarEdad(), vista.pedirMatricula()));
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

    public int obtEstudiantePorMatricula(int busquedaMatricula){ // Buscar estudiante en el ArrayList

        int posicion = -1;
        for (int i = 0; i < estList.size(); i++) {
            if (estList.get(i).getMatricula() == busquedaMatricula) {
                    return i;
            }
        }
       // System.out.println(posicion);
        return posicion;
    }

    
    public Estudiante informacionEstudiante(int posicion){ // Mostrar información de un estudiante por matrícula

        if (posicion != -1) {
            return estList.get(posicion);
        }
        return null;

    } 

     
    public int borrarEstudiante(int posicion){ // Borrar a un estudiante por matrícula
       if (posicion != -1) {
        vista.imprimirInfoEstudiante(estList.get(posicion));
        estList.remove(estList.get(posicion));
        return 1;
        // return;
       } 
       return 0;
    }

  
    public Estudiante modificarNombreEstudiante(int posicion){ // Modificar el nombre de un estudiante

        if(posicion != -1){

            vista.imprimirInfoEstudiante(informacionEstudiante(posicion));
           
            estList.get(posicion).setNombre(vista.ingresarNombre());
            return estList.get(posicion);
            
        }
        return null;
    }

    public Estudiante modificarEdadEstudiante(int posicion){ // Modificar la edad de un estudiante

        if(posicion != -1){

            vista.imprimirInfoEstudiante(informacionEstudiante(posicion));

            estList.get(posicion).setEdad(vista.ingresarEdad());
            return estList.get(posicion);

        }
        return null;
    }

    public Estudiante modificarCalificacionEstudiante(int posicion){ // Modificar la calificacion de un estudiante

        if(posicion != -1){

            vista.imprimirInfoEstudiante(informacionEstudiante(posicion));
           
            estList.get(posicion).setCalificacion(vista.ingresarCalificacion());
            return estList.get(posicion);
            
        }
        return null;
    }


    public void menuModificarEstudiante(){ // Menú de la opción de modificar atributos de un estudiante
        int opcion = 0;

        while (opcion != 4) {
            
            switch (vista.menuEleccionModificarEstudiante()) {

                case 1: vista.imprimirModificacionNombre(modificarNombreEstudiante(obtEstudiantePorMatricula(vista.pedirMatricula())));
                    break;
    
                case 2: vista.imprimirModificacionEdad(modificarEdadEstudiante(obtEstudiantePorMatricula(vista.pedirMatricula())));
                    break;
    
                case 3: vista.imprimirModificacionCalificacion(modificarCalificacionEstudiante(obtEstudiantePorMatricula(vista.pedirMatricula())));
                    break;

                case 4: opcion = 4;
                    break;

                default: vista.mensajeOpcionDesconocida();
                break;

            }

        }
    } 

    public void menuEstudiante() throws IOException{
        Integer opcion = 0;

        while (opcion != 6) {

            switch (vista.menu()) {

                case 1: System.out.println();
                    addEstudiante();
                    break;
                
                case 2: System.out.println();
                    vista.imprimirListaEstudiantes(estList);
                    break;

                case 3:  System.out.println();
                    Integer aux;
                    aux = vista.pedirMatricula();
                    vista.imprimirInfoEstudiante(informacionEstudiante(obtEstudiantePorMatricula(aux)));
                    break;

                case 4: System.out.println();
                    aux = vista.pedirMatricula();
                    vista.notificacionBorradoEstudiante(borrarEstudiante(obtEstudiantePorMatricula(aux)));
                    break;

                case 5: menuModificarEstudiante();
                    break;

                case 6: opcion = 6;
                    break;

                default: vista.mensajeOpcionDesconocida();
            }
            
        }
    }

}
