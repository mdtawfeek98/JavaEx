import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OCountCharacter {

    public static void main(String[] args) {

     String name = "tawfeek";

     Map<Character, Integer> mp = new LinkedHashMap<>();

     for (int i=0; i<name.length(); i++){
         char ch = name.charAt(i);
         if (ch != ' '){
             if (mp.containsKey(ch)){
                 mp.put(ch, mp.get(ch)+1);
             }
             else {
                 mp.put(ch,1);

             }
         }
     }

     for (Map.Entry<Character, Integer> mm : mp.entrySet()){
         if(mm.getValue()>0){
             System.out.println(mm.getKey()+ "-->"+ mm.getValue());
         }
     }
    }
}
