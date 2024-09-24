package unidad.recursividad;

public class TrianguloPascalRec {
    public TrianguloPascalRec(){
        ///todo realizar el triangulo de pascal hasta el nivel deseado
        System.out.println(t(4,2));
        System.out.println(t(5,5));
        System.out.println(t(5,3));
    }

    public int t(int i, int j){
        //cond parada
        if(j==0 || j==i)
            return 1;
        else return t(i-1,j-1)+t(i-1,j);
    }

    public static void main(String[] args) {
        new TrianguloPascalRec();
    }
}
