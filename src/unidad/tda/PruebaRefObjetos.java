package unidad.tda;

public class PruebaRefObjetos {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("rebrin","segundo","123546");
        Estudiante eRef=e1;
        eRef.setNombre("Jose");
        System.out.println(e1);
        System.out.println(eRef);
    }
}
