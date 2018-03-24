package bitset;

import java.util.*;

public class bitset16 {

    private static int size;
    private static ArrayList<String> a = new ArrayList<>(size);

    public bitset16(int size) {
        this.size = size;

        for (int i = 0; i < size; i++) {
            a.add(i, "Object" + i);
        }
    }

    public static Set<String> union(Set<String> other) {

        Set<String> result = new HashSet<>(other);
        result.addAll(a);

        return result;
    }


    public static Set<String> intersection(Set<String> other) {

        Set<String> result = new HashSet<>(other);
        result.retainAll(a);

        return result;
    }

    public static Set<String> complement(Set<String> other) {

        Set<String> result = new HashSet<>(other);
        result.removeAll(a);

        return result;
    }

    public static Set<String> add(Set<String> other, int num) {

        Set<String> result = new HashSet<>(other);
        result.add(a.get(num));

        return result;
    }


    public static Set<String> remove(Set<String> other, int num) {

        Set<String> result = new HashSet<>(other);
        result.remove(a.get(num));

        return result;
    }

    public static boolean check(Set<String> other, int num) {

        return other.contains(a.get(num));

    }

    @Override
    public String toString() {
        return "bitset16{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}