package unidad.tda;

import java.util.Arrays;

public class PruebaMatrix {
    int [][] triangulo={
            {1},
            {1,1},
            {1,2,1},
            {1,3,3,1}};
    public PruebaMatrix(){
        System.out.println(Arrays.toString(triangulo));
    }

    public void imprimir(){
//        System.out.println(triangulo.length);
        for(int i=0;i<triangulo.length;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PruebaMatrix m=new PruebaMatrix();
        m.imprimir();
    }
}
