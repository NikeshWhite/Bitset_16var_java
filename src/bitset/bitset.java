package bitset;

import java.util.*;
/*
class bitSet {

    private int sizeA;
    private int sizeB;

    public bitSet(int sizeA, int sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    block a = new block("A", sizeA);
    block b = new block("B", sizeB);



    HashMap sum (List<String> some1, List<String> some2) {

        a.createBlock(some1);
        b.createBlock(some2);

        HashMap<Integer, String> result = new HashMap<>();

        for (int key = 0; key < sizeA; key++) {

            result.put(key, some1.get(key));
        }

        for (int key = sizeA; key < sizeB+sizeA; key++) {

            result.put(key, some2.get(key));
        }

        return result;

    }

   /* public static void removeTheFirstNameDuplicates(HashMap<Integer, String> map)
    {
        HashMap<Integer,String> map1 = new HashMap<>();
        String val;
        int key;
        for (Map.Entry<Integer, String> pair : map.entrySet()){
            val = pair.getValue();
            key = pair.getKey();
            if (map1.containsValue(val)){
                continue;
            }
            else{
                map1.put(key,val);
            }
        }
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> pair = iterator.next();
            iterator.remove();
        }

        for (Map.Entry<Integer,String> pair: map1.entrySet()){
            key = pair.getKey();
            val = pair.getValue();
            map.put(key,val);
        }
    }

/*

    HashMap <Integer, String> intersection (List<String> some1, List<String> some2) {

        a.createBlock(some1);
        b.createBlock(some2);

        HashMap<Integer, String> result = new HashMap<>();

        int sizeAll = sizeA + sizeB;

        for (int i = 0; i < sizeAll; i++) {

            for(int j = 0; j < sizeAll; j++) {

                if (a.get(i) == b.get(j)){

                    result.put();
                }
            }
        }

        for (int key = 0; key < sizeA; key++) {

            result.put(key, some1);
        }

        for (int key = sizeA; key < sizeB+sizeA; key++) {

            result.put(key, some2);
        }

        removeTheFirstNameDuplicates(result);

        return result;

    }

*/

    /*void sum (HashMap<Integer, String> a, HashMap<Integer, String> b) {

        Map<Integer, String> blockSum = new HashMap<Integer, String>(aa);
        blockSum.putAll(bb);

    }

    void intersection (bitSet block1, bitSet block2) {

    }*/
/*
}

class block12 extends HashMap {

    public int size;
    public String name;

    public block(String name, int size) {
        this.name = name;
        this.size = size;
    }

    Map<Integer, String> elem = new HashMap<>();

    Map<Integer, String> createBlock12 (List<String> objects) {

        for (int key = 0; key < size; key++) {

            elem.put(key, objects.get(key));
        }

        return elem;

    }

}
*/