package bitset;

import java.util.*;

class bitSet {

    public int size;
    public String name;

    public bitSet(String name, int size) {

        this.name = name;
        this.size = size;

    }

    void sum (HashMap<Integer, String> block1, HashMap<Integer, String> block2) {

        Map<Integer, String> blockSum = new HashMap<Integer, String>(block1);
        blockSum.putAll(block2);

    }

    void intersection (bitSet block1, bitSet block2) {

    }

}
