
import java.util.*;

public class hsmp {
  public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();
    map.put("Madan", 45);
    map.put("Madhu", 455);
    
    System.out.println(map.get("Madan"));  
    System.out.println(map.getOrDefault("Madansd",88));  
    System.out.println(map.containsKey("Madan"));
    System.out.println(map.containsValue(88));
    HashSet<Integer> s=new HashSet<>();
    s.add(55);
    s.add(25);
    s.add(55);
    System.out.println(s);
  }
}
