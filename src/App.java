//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        VistaEstudiante vistaEst = new VistaEstudiante();
        ControladorEstudiante Estudiantes = new ControladorEstudiante(vistaEst);
        Estudiantes.menuEstudiante();
        VistaProfesor vistaProf = new VistaProfesor();
        ControladorProfesor Profesores = new ControladorProfesor(vistaProf);
        Profesores.menuProfesor();


        /*Scanner reader = new Scanner(System.in);
       //BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Estudiante> estList = new ArrayList<Estudiante>();
        
        //Lectura de cuantos estudiantes
        System.out.println("Escriba el número de estudiantes: ");
        int num = reader.nextInt();

        Estudiante obj1; //declaración 

        //Lectura de muchos estudiantes

        for (int i = 0; i < num; i++) {

            /* Forma sin el método leerDatos en la clase Estudiante

           obj1 = new Estudiante();

           System.out.println("Ingrese el nombre del estudiante "+ (i+1)+":");
            obj1.setNombre(reader2.readLine());
           
           System.out.println("Ingrese la calificación del estudiante "+ (i+1)+":");
            obj1.setCalificacion(reader.nextDouble());

            System.out.println("Ingrese la edad del estudiante "+ (i+1)+":");
            obj1.setEdad(reader.nextInt());

            System.out.println("Ingrese la matrícula del estudiante:");
            obj1.setEdad(reader.nextInt());

            estList.add(obj1);
            */

            //Forma con el método leerDatos en la clase Estudiante

            //Lectura manera 1
            
            /*obj1 = new Estudiante();

            obj1.leerDatos();

            estList.add(obj1);

            //Lectura manera 2

            //estList.add(0, new Estudiante());
            //estList.get(0).leerDatos();
        } */

       /* //Primer estudiante
        Estudiante obj1 = new Estudiante();

        obj1.calificacion = 100.;
        obj1.edad = 21;
        obj1.nombre = "Jose";
        ob1.matricula = 18784951;

        estList.add(obj1);

        //Segundo estudiante
        obj1 = new Estudiante();

        obj1.calificacion = 90.;
        obj1.edad = 18;
        obj1.nombre = "Franco";
        ob1.matricula = 98784951;

        estList.add(obj1); */

        // manera de agregar directo 1
        //obj1 = new Estudiante("José Carlos", 98.5, 18, 78945602);
        //estList.add(obj1);

        //manera de agregar directo 2
      //  estList.add(0, new Estudiante("José Carlos", 98.5, 18, 78945602));

        //Salida
       /* for (int j = 0; j < estList.size(); j++) {
            //System.out.println("El estudiante "+ estList.get(j).getNombre() + " con matrícula " + estList.get(j).getMatricula() + " su calificación es " + estList.get(j).getCalificacion());
            //estList.get(j).imprimirDatos(); //Impresión con el método imprimirDatos() en la clase Estudiante

            System.out.println(estList.get(j)); //imprimir con el toString() em clase Estudiante
        } */

        //System.out.println("El estudiante "+ obj1.nombre + " su calificación es " + obj1.calificacion);

        //reader.close();
    }
}
