package unidad.recursividad;

import java.util.Scanner;

public class IteraVsRec {
    public IteraVsRec(){
        Scanner s= new Scanner(System.in);
        System.out.println("introduce el numero");
        int num=s.nextInt();
        System.out.println("introduce la potencia");
        int potencia=s.nextInt();
        System.out.println("solucion iterativa");
        System.out.println(potenciaIt(num,potencia));
        System.out.println(potenciaRec(num,potencia));
    }

    public int potenciaRec(int n, int potencia){
        //condicion parada
        if(potencia==0)
            return 1;
        if(potencia==1)
            return n;
        else return n*potenciaRec(n,potencia-1);
    }

    public int potenciaIt(int n, int potencia){
        int res=n;
        for (int i = 1; i < potencia; i++) {
            res*=n;
        }
        return res;
    }

    public static void main(String[] args) {
        new IteraVsRec();
    }

}
