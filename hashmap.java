import java.util.*;

public class hashmap {
    public static void main(String[] args) {
       HashMap<Integer,Integer> m=new HashMap<>();
       m.put(1,23);
       m.put(2,29);
       m.put(3,26);
        for(int i:m.keySet()){
            System.out.print(m.get(i)+" ");
        }
    }
}
