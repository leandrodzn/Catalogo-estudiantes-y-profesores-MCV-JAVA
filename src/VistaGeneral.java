import java.io.IOException;
import java.util.Scanner;

public class VistaGeneral {

    Scanner reader;

    public Integer menu(){ // Menú principal

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("---- Menú principal ----");

        System.out.println("[1] Ir a menú de estudiante");
        System.out.println("[2] Ir a menú de profesor");
        System.out.println("[3] Salir");
        System.out.print("Opción: ");

        return reader.nextInt();

    }

    public void mensajeOpcionDesconocida(){
        System.out.println("- Opción no reconocida. Inténtelo de nuevo -");
    }

    public void menuPrincipal() throws IOException{
        Integer opcion = 0;

        while (opcion != 3) {

            switch (menu()) {

                case 1: System.out.println();
                    VistaEstudiante vistaEst = new VistaEstudiante();
                    ControladorEstudiante Estudiantes = new ControladorEstudiante(vistaEst);
                    Estudiantes.menuEstudiante();
                    break;
                
                case 2: System.out.println();
                    VistaProfesor vistaProf = new VistaProfesor();
                    ControladorProfesor Profesores = new ControladorProfesor(vistaProf);
                    Profesores.menuProfesor();
                    break;

                case 3: opcion = 3;
                    break;

                default: mensajeOpcionDesconocida();
            }
            
        }
    }
}
