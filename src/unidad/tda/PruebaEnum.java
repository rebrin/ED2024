package unidad.tda;

enum DIA {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esDiaEntreSemana() {
        return this != DOMINGO && this != SABADO;
    }
}

public class PruebaEnum {
    public static void main(String[] args) {
        DIA hoy = DIA.MARTES;
        if (hoy.esDiaEntreSemana())
            System.out.println("estamos entre semana");
        else
            System.out.println("Es fin de semana");
    }

    //todo agregar el Enumerado estado del alumno, en la clase alumno
    /*
    * inscrito
    * reinscrito
    * baja_temporal
    * baja_definitiva
    * */
}
