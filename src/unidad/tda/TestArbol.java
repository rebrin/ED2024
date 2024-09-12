package unidad.tda;

import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TestArbol {
    public static void main(String[] args) {
        TreeSet<Integer> arbol=new TreeSet<>();
        arbol.add(4);
        arbol.add(2);
        arbol.add(3);
        arbol.add(1);
        arbol.add(7);
        arbol.add(8);
        arbol.add(6);

        System.out.println(arbol.toString());
        System.out.println(arbol.contains(8)); //busquedas
        arbol.remove(4);//eliminacion
        System.out.println(arbol.toString());
        Random r=new Random();
        int n=10000000;
        /*comparado con listas*/
        ArrayList<Integer>lista=new ArrayList<>();
        Long ti=System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            //arbol.add(r.nextInt(n-1));
            lista.add(r.nextInt(n-1));
        }
//        arbol.add(n);
//        System.out.println(arbol.contains(n));
        lista.add(n);
        System.out.println(lista.contains(n));

        System.out.println((System.currentTimeMillis()-ti)/1000);

    }

}
