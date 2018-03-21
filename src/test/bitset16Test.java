package test;
import bitset.bitset16;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class bitset16Test {

    private static HashMap<Integer, String> objects1;
    static {
        objects1 = new HashMap<>();
        objects1.put(0, "Java");
        objects1.put(1, "Scala");
        objects1.put(2, "Groovy");
    }

    private static HashMap<Integer, String> objects2;
    static {
        objects2 = new HashMap<>();
        objects2.put(0, "Hello");
        objects2.put(1, "Scala");
        objects2.put(2, "none");
    }

    private static HashSet<String> resultUnion;
    static {
        resultUnion = new HashSet<>();
        resultUnion.add("Java");
        resultUnion.add("Groovy");
        resultUnion.add("Scala");
        resultUnion.add("none");
        resultUnion.add("Hello");
    }

    private static HashSet<String> resultIntersection;
    static {
        resultIntersection = new HashSet<>();
        resultIntersection.add("Scala");
    }

    private static HashSet<String> resultComplement;
    static {
        resultComplement = new HashSet<>();
        resultComplement.add("Groovy");
        resultComplement.add("Java");
    }
    
    private static HashSet<String> resultAdd;
    static {
        resultAdd = new HashSet<>();
        resultAdd.add("Java");
        resultAdd.add("Scala");
        resultAdd.add("Groovy");
        resultAdd.add("First");
        resultAdd.add("Second");
        resultAdd.add("Third");
    }

    private static HashSet<String> resultRemove;
    static {
        resultRemove = new HashSet<>();
        resultRemove.add("Java");
        resultRemove.add("Scala");
    }

    @Test
    public void testUnion() {
        assertEquals(new HashSet<>(resultUnion), bitset16.union(new HashMap<>(objects1), new HashMap<>(objects2)));
    }

    @Test
    public void testIntersection() {
        assertEquals(new HashSet<>(resultIntersection), bitset16.intersection(new HashMap<>(objects1), new HashMap<>(objects2)));
    }

    @Test
    public void testComplement() {
        assertEquals(new HashSet<>(resultComplement), bitset16.complement(new HashMap<>(objects1), new HashMap<>(objects2)));
    }

    @Test
    public void testAdd() {
        assertEquals(new HashSet<>(resultAdd), bitset16.add(new HashMap<>(objects1), new String[]{"First", "Second", "Third"}));
    }

    @Test
    public void testRemove() {
        assertEquals(new HashSet<>(resultRemove), bitset16.remove(new HashMap<>(objects1), new String[]{"Groovy"}));
    }

    @Test
    public void testCheck() {
        assertTrue(bitset16.check(objects1, "Java"));
        assertFalse(bitset16.check(objects1, "First"));
    }
}