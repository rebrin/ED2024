import java.util.Arrays;
import java.util.Scanner;

public class TestEstudiante {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);//lectura del teclado
        Estudiante estudiante=new Estudiante("rebrin","segundo","199925");
        System.out.println(estudiante.getNombre()+" "+estudiante.getNControl());
        System.out.println("introduce el nombre del alumno");
        String NuevoNombre=s.nextLine();
        System.out.println("introduce el grado");
        String NuevoGrado=s.nextLine();
        System.out.println("introduce el Numero de control");
        String NuevoControl=s.nextLine();
        Estudiante estudiante1=new Estudiante(NuevoNombre,NuevoGrado,NuevoControl);
        System.out.println(estudiante);
        System.out.println(estudiante1);
        //datos estructurados
        Estudiante [] Alumnos=new Estudiante[10];
        Alumnos[0]=estudiante;
        Alumnos[1]=estudiante1;
        Estudiante estudiante2=new Estudiante("Maria","segundo","98343225");
        Alumnos[2]=estudiante2;
        System.out.println(Arrays.toString(Alumnos));

    }
}
