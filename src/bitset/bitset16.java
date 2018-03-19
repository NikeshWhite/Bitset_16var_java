package bitset;

import java.util.*;

public class bitset16 {

    private int size;

    bitset16(int size) {
        this.size = size;
    }

    /*HashSet<String> createBlock(HashMap<Integer, String> objects) {
        HashSet<String> A = new HashSet<>(objects.values());
        return A;
    }*/

    HashSet<String> union(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    HashSet<String> intersection(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.retainAll(b);
        return a;
    }

    HashSet<String> complement(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }


    HashSet<String> add(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.removeAll(b);
        a = result;


        return result;
    }


}