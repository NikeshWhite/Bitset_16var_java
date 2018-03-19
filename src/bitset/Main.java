package bitset;

import java.util.*;

public class Main {

    public static HashMap<Integer, String> objects1;
    static {
        objects1 = new HashMap();
        objects1.put(0,"Java");
        objects1.put(1,"Scala");
        objects1.put(2,"Groovy");
    }

    public static HashMap<Integer, String> objects2;
    static {
        objects2 = new HashMap();

        objects2.put(0,"Hello");
        objects2.put(1,"Scala");
        objects2.put(2,"none");
    }



    public static void main(String[] args) {
        // write your code here

        bitset16 z = new bitset16(objects1.size());

        System.out.print(z.complement(objects1, objects2));

    }
}
