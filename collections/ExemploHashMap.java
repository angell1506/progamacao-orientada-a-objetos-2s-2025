package collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", nul"Brasíla");
        capitais.put("França", "Paris");
        capitais.put("Japão", "Tóquio");

        System.out.println(capitais.get("Japão"));
    }
}
