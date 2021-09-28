
import java.util.Scanner;

public class VistaGeneral {

    Scanner reader;

    public Integer menu(){ // Menú principal

        reader = new Scanner(System.in);

        System.out.println();
        System.out.println("---- Menú principal ----");

        System.out.println("\n[1] Ir a menú de estudiante");
        System.out.println("[2] Ir a menú de profesor");
        System.out.println("[3] Salir");
        System.out.print("Opción: ");

        return reader.nextInt();

    }

    public void mensajeOpcionDesconocida(){
        System.out.println("- Opción no reconocida. Inténtelo de nuevo -");
    }

}
