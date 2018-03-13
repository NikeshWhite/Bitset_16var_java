package bitset;

import java.util.*;

class bitSet {


    HashMap<Integer, String> aa = new HashMap<>();

    HashMap<Integer, String> bb = new HashMap<>();



    void sum (HashMap<Integer, String> aa, HashMap<Integer, String> bb) {

        Map<Integer, String> blockSum = new HashMap<Integer, String>(aa);
        blockSum.putAll(bb);

    }

    void intersection (bitSet block1, bitSet block2) {

    }

}

class block {

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
