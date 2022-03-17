import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapdemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","Gopal");
        map.put("ceo","sunder");
        map.put("amazon","jeff bezos");
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" ,"+map.get(key));
        }


    }
}
