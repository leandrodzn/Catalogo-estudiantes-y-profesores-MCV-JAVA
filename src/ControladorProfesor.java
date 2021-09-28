import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorProfesor {
    
    private ArrayList <Profesor> profList;

    Scanner reader;

    VistaProfesor vistaProf; 

    ControladorProfesor(VistaProfesor vistaProf){
        profList = new ArrayList<Profesor>();
        this.vistaProf = vistaProf;
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

    public void addProfesor() throws IOException{ // Agregar profesores con atributos
        profList.add(0, new Profesor(vistaProf.ingresarNombre(), vistaProf.ingresarEdad(), vistaProf.pedirClave(), vistaProf.ingresarSalario()));
    }    
   

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
        vistaProf.imprimirInfoProfesor(profList.get(posicion));
        profList.remove(profList.get(posicion));
        return 1;
        // return;
       } 
       return 0;
    }

  
    public Profesor modificarNombreProfesor(int posicion){ // Modificar el nombre de un profesor

        if(posicion != -1){

            vistaProf.imprimirInfoProfesor(informacionProfesor(posicion));
           
            profList.get(posicion).setNombre(vistaProf.ingresarNombre());
            return profList.get(posicion);
            
        }
        return null;
    }

    public Profesor modificarEdadProfesor(int posicion){ // Modificar la edad de un profesor

        if(posicion != -1){

            vistaProf.imprimirInfoProfesor(informacionProfesor(posicion));

            profList.get(posicion).setEdad(vistaProf.ingresarEdad());
            return profList.get(posicion);

        }
        return null;
    }

    public Profesor modificarSalarioProfesor(int posicion){ // Modificar la calificacion de un profesor

        if(posicion != -1){

            vistaProf.imprimirInfoProfesor(informacionProfesor(posicion));
           
            profList.get(posicion).setSalario(vistaProf.ingresarSalario());
            return profList.get(posicion);
            
        }
        return null;
    }


    public void menuModificarProfesor(){ // Menú de la opción de modificar atributos de un estudiante
        int opcion = 0;

        while (opcion != 4) {
            
            switch (vistaProf.menuEleccionModificarProfesor()) {

                case 1: vistaProf.imprimirModificacionNombre(modificarNombreProfesor(obtProfesorPorClave(vistaProf.pedirClave())));
                    break;
    
                case 2: vistaProf.imprimirModificacionEdad(modificarEdadProfesor(obtProfesorPorClave(vistaProf.pedirClave())));
                    break;
    
                case 3: vistaProf.imprimirModificacionSalario(modificarSalarioProfesor(obtProfesorPorClave(vistaProf.pedirClave())));
                    break;

                case 4: opcion = 4;
                    break;

                default: vistaProf.mensajeOpcionDesconocida();
                break;

            }

        }
    } 

    public void menuProfesor() throws IOException{
        Integer opcion = 0;

        while (opcion != 6) {

            switch (vistaProf.menuProfesor()) {

                case 1: System.out.println();
                    addProfesor();
                    break;
                
                case 2: System.out.println();
                    vistaProf.imprimirListaProfesores(profList);
                    break;

                case 3:  System.out.println();
                    Integer aux;
                    aux = vistaProf.pedirClave();
                    vistaProf.imprimirInfoProfesor(informacionProfesor(obtProfesorPorClave(aux)));
                    break;

                case 4: System.out.println();
                    aux = vistaProf.pedirClave();
                    vistaProf.notificacionBorradoProfesor(borrarProfesor(obtProfesorPorClave(aux)));
                    break;

                case 5: menuModificarProfesor();
                    break;

                case 6: opcion = 6;
                    break;

                default: vistaProf.mensajeOpcionDesconocida();
            }
            
        }
    }

}
