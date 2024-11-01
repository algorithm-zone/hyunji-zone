import java.util.HashMap;

public class Prac_HashMap {

    public void solution(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("orange", 2);
        map.put("banana", 1);
        String key = "orange";
        if(map.containsKey(key)){
            System.out.println(map.get(key));
        }
    }
    public static void main(String[] args) {
        Prac_HashMap prac = new Prac_HashMap();
        prac.solution();
        
    }
    
}