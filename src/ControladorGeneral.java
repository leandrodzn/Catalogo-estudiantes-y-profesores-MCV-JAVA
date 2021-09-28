import java.io.IOException;

public class ControladorGeneral {

    VistaGeneral vista;

    ControladorGeneral(VistaGeneral vista){
        this.vista = vista;
    }

    public void menuPrincipal() throws IOException{
        Integer opcion = 0;

        while (opcion != 3) {

            switch (vista.menu()) {

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

                default: vista.mensajeOpcionDesconocida();
            }
            
        }
    }
    
}
