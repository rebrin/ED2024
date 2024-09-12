package unidad.tda;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaArchivosEst {
    public static void escribe(){
        //escritura de elementos
        Estudiante re=new Estudiante("rebrin","primero","01234");
        Estudiante may=new Estudiante("mayra","segundo","7813");
        Estudiante iva=new Estudiante("ivana","primero","9752321");
        Estudiante val=new Estudiante("valentina","tercero","7986132");
        //agregar los estudiantes a la lista
        List<Estudiante> estudiantes=new ArrayList<>();
        estudiantes.add(re);
        estudiantes.add(may);
        estudiantes.add(iva);
        estudiantes.add(val);
        try {
            Files.write(Paths.get("./src/Estudiantes.csv"), estudiantes
                    .stream().map(estudiante -> estudiante.toCsv())
                    .reduce("", (acum, csv) -> acum + csv + "\n")
                    .getBytes(StandardCharsets.UTF_8));
            System.out.println("coleccion guardada");
        }catch (Exception e){
            System.err.println("hubo un error");
            e.printStackTrace();
        }
    }


    public static void leer() throws IOException {
        Stream<String> lineas= Files.lines(Paths.get("./src/Estudiantes.csv"));
        List<Estudiante>listaEstudiantes=lineas.map(linea->linea.split(","))
                .map(arr->new Estudiante(arr[0],arr[1],arr[2]))
                .collect(Collectors.toList());
        System.out.println(listaEstudiantes.toString());

    }

    public static void main(String[] args) {
        try {
            leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //todo guardado de algun objeto de collection en archivo
    //todo hacer un menu para recibir las opciones de CRUD y Guardar

}
