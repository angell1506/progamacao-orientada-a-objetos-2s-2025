package collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasíla");
        capitais.put("França", "Paris");
        capitais.put("Japão", "Tóquio");

        System.out.println(capitais.get("Japão"));

        if(capitais.containsKey("Brasil")){
            System.out.println("A capital do Brasil está no HashMap");
        }

        if(capitais.containsKey("Argentina")){
            System.err.println("A capital da Argentina está no HashMap");
        }

        for (String chave : capitais.keySet()) {
            System.out.println(chave+ " - " + capitais.get(chave));
        }
    }
}
