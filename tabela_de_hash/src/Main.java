
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        System.out.println(map.get(1));
        System.out.println(map.get(10));
        map.put(2,null);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        map.put(null,1);
        String texto = "aqui tem um texto com um monte de letra";
        Map<Character, Integer> freq = new HashMap<>();
        for (var c: texto.toCharArray()){
            if (freq.containsKey(c)){
                freq.replace(c, freq.get(c)+1);
            } else {
                freq.put(c, 1);
            }
        }
        System.out.println(freq);

    }
}