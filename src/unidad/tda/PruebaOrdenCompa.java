package unidad.tda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaOrdenCompa {
    //atributos de clase
    ArrayList<Estudiante> estudiantes;

    public PruebaOrdenCompa() {
        //inicializar
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("profesor", "Primero", "012354"));
        estudiantes.add(new Estudiante("tokio", "Primero", "456213"));
        estudiantes.add(new Estudiante("berlin", "Segundo", "7984513"));
        estudiantes.add(new Estudiante("rio", "Segundo", "222354"));
    }

    public static void main(String[] args) {
        PruebaOrdenCompa obj = new PruebaOrdenCompa();
        System.out.println(obj.estudiantes.toString());
        Collections.sort(obj.estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNControl().compareTo(o2.getNControl());
            }
        });

        obj.estudiantes.stream()
                .forEach(estudiante -> {
                    estudiante.setNombre(estudiante.getNombre().toUpperCase());
                    System.out.println(estudiante);
                });

        System.out.println();
        List<Estudiante> filtrada =
                obj.estudiantes.stream().filter(estudiante -> estudiante.getNombre().length() < 5)
                        .collect(Collectors.toList());
        filtrada.stream().forEach(estudiante -> System.out.println(estudiante));

    }
}
