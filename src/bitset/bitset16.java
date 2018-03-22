package bitset;

import java.util.*;

public class bitset16 {

    private static int size;

    public bitset16(int size) {
        this.size = size;
    }

    public static HashSet<Integer> union(HashSet<Integer> A) {

        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < size; i++) {
            a.add(i);
        }

        a.addAll(A);
        return a;
    }

    public static HashSet<Integer> intersection(HashSet<Integer> A) {

        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < size; i++) {
            a.add(i);
        }
        a.retainAll(A);
        return a;
    }

    public static HashSet<Integer> complement(HashSet<Integer> A) {

        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < size; i++) {
            a.add(i);
        }
        a.removeAll(A);
        return a;
    }
/*
    public static HashSet<String> add(HashSet<Integer> A) {

        HashSet<String> a = new HashSet<>(A.values());

        a.addAll(Arrays.asList(element));

        return a;
    }
    public static HashSet<String> remove(HashMap<Integer, String> A, String[] element) {

        HashSet<String> a = new HashSet<>(A.values());

        a.removeAll(Arrays.asList(element));

        return a;
    }

    public static boolean check(HashMap<Integer, String> A, String element) {

        HashSet<String> a = new HashSet<>(A.values());

        return a.contains(element);

    }
*/

}