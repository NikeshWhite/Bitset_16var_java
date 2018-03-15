package bitset;

import java.util.*;

class bitSet {

    private int sizeA;
    private int sizeB;

    public bitSet(int sizeA, int sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    block a = new block("A", sizeA);
    block b = new block("B", sizeB);

    HashMap sum (String some1, String some2) {

        a.createBlock(some1);
        b.createBlock(some2);

        HashMap<Integer, Object> result = new HashMap<>();

        for (int key = 0; key < sizeA; key++) {

            result.put(key, some1);
        }

        for (int key = sizeA; key < sizeB+sizeA; key++) {

            result.put(key, some2);
        }

        return result;

    }

    HashMap intersection (String some1, String some2) {



        a.createBlock(some1);
        b.createBlock(some2);

        HashMap<Integer, Object> result = new HashMap<>();

        int sizeAll = sizeA + sizeB;

        for (int count = 0; count > sizeAll; count ++) {



        }





    }



    /*void sum (HashMap<Integer, String> a, HashMap<Integer, String> b) {

        Map<Integer, String> blockSum = new HashMap<Integer, String>(aa);
        blockSum.putAll(bb);

    }

    void intersection (bitSet block1, bitSet block2) {

    }*/

}

class block extends HashMap {

    public int size;
    public String name;

    public block(String name, int size) {
        this.name = name;
        this.size = size;
    }

    HashMap<Integer, String> elem = new HashMap<>();

    HashMap<Integer, String> createBlock (String objects) {

        for (int key = 0; key < size; key++) {

            elem.put(key, objects);
        }

        return elem;

    }

}
