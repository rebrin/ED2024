package unidad.tda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaHash {
    public static void main(String[] args) {
        Map<Character, String> diccMorse = new HashMap<>();
        diccMorse.put('a', ".-");
        diccMorse.put('b', "-...");
        diccMorse.put('c', "-.-.");
        diccMorse.put('d', "-..");
        diccMorse.put('e', ".");
        diccMorse.put('f', "..-.");
        diccMorse.put('g', "--.");
        //todo completar el codigo morse completo
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la cadena");
        String cadenaEntrada = scanner.nextLine().toLowerCase();
        for (int i = 0; i < cadenaEntrada.length(); i++) {
            char car = cadenaEntrada.charAt(i);
            System.out.println(diccMorse.get(car));
        }
    }
}
