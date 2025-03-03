package Ejercicio2;
import java.util.HashMap;
import java.util.Map;

public class AtBash implements CifradoAtBash {
    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String CLAVE = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";

    private final Map<Character, Character> mapaCifrado = new HashMap<>();
    private final Map<Character, Character> mapaDescifrado = new HashMap<>();

    public AtBash() {
        for (int i = 0; i < ALFABETO.length(); i++) {
            mapaCifrado.put(ALFABETO.charAt(i), CLAVE.charAt(i));
            mapaDescifrado.put(CLAVE.charAt(i), ALFABETO.charAt(i));
        }
    }

    @Override
    public String atBash(String mensaje) {
        StringBuilder resultado = new StringBuilder();
        for (char c : mensaje.toCharArray()) {
            resultado.append(mapaCifrado.getOrDefault(c, c));
        }
        return resultado.toString();
    }

    @Override
    public String reves(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

}
