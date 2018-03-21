package bitset;

import java.util.*;

public class bitset16 {

    private int size;

    bitset16(int size) {
        this.size = size;
    }

    public static HashSet<String> union(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static HashSet<String> intersection(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static HashSet<String> complement(HashMap<Integer, String> A, HashMap<Integer, String> B) {

        HashSet<String> a = new HashSet<>(A.values());
        HashSet<String> b = new HashSet<>(B.values());

        HashSet<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static HashSet<String> add(HashMap<Integer, String> A, String[] element) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bitset16 bitset16 = (bitset16) o;
        return size == bitset16.size;
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "bitset16{" +
                "size=" + size +
                '}';
    }
}