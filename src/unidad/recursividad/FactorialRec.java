package unidad.recursividad;
import java.util.*;

public class FactorialRec {
    Scanner s;
    //constructor
    public FactorialRec(){
        System.out.println("Introduce el valor recursivo a calcular");
        s=new Scanner(System.in);
        long n=s.nextLong();
        //llamar a factorial
        long valor=factorial(n);
        System.out.println(valor);
        System.out.println(Long.toBinaryString(valor));

    }
    public long factorial(long n){
        //caso base
        if(n==1 || n ==0)
            return 1;
        //paso recursivo
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        new FactorialRec();
    }
}
