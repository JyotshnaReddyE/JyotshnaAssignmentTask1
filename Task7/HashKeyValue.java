package AS1T7;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class HashKeyValue {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(3, "Welcome");
        hmap.put(11, "to");
        hmap.put(5, "Big");
        hmap.put(7, "Data");
        hmap.put(9, "Analytics");
        hmap.put(66, "Class");

        System.out.println("Before Sorting:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}
