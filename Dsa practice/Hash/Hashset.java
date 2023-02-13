package HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        if(set.contains(1)){
            System.out.println("set contains 1");
        }

//        set.remove(1);

        System.out.println(set.size());

        System.out.println(set);

        Iterator it  = set.iterator();

        if(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
