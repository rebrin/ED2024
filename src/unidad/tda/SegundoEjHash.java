package unidad.tda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SegundoEjHash {
    //vamos a crear una tabla con las materias de un estudiante
    public static void main(String[] args) {
        Map<Estudiante, ArrayList<Materia>> diccMaterias = new HashMap<>();
        Estudiante e1 = new Estudiante("rebrindanard", "primero", "46565132");
        Estudiante e2 = new Estudiante("mayra", "segundo", "789513");
        Materia estructuraDatos=new Materia("Estructura de datos","svc-1010","jose");
        Materia graficacion=new Materia("graficacion","svc-1892","jose");
        Materia mineria=new Materia("Mineria de datos","svc-1015","miguel");
        Materia ia=new Materia("IA","svc-1115","miguel");

        ArrayList<Materia> l1=new ArrayList<>();
        l1.add(estructuraDatos);
        l1.add(graficacion);
        l1.add(mineria);

        ArrayList<Materia> l2=new ArrayList<>();
        l2.add(estructuraDatos);
        l2.add(graficacion);


        diccMaterias.put(e1,l1);
        diccMaterias.put(e2,l2);

        ArrayList<Materia>materias=diccMaterias.get(e2);
        materias.add(ia);

        System.out.println(diccMaterias.toString());

    }
}
