package test;
import bitset.bitset16;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class bitset16Test {

    bitset16 x = new bitset16(5);

    private static HashSet<Integer> objects1;
    static {
        objects1 = new HashSet<>();
        objects1.add(3);
        objects1.add(4);
        objects1.add(88);
    }

    private static HashSet<Integer> resultUnion;
    static {
        resultUnion = new HashSet<>();
        resultUnion.add(0);
        resultUnion.add(1);
        resultUnion.add(2);
        resultUnion.add(3);
        resultUnion.add(4);
        resultUnion.add(88);
    }

    private static HashSet<Integer> resultIntersection;
    static {
        resultIntersection = new HashSet<>();
        resultIntersection.add(3);
        resultIntersection.add(4);
    }

    private static HashSet<Integer> resultComplement;
    static {
        resultComplement = new HashSet<>();
        resultComplement.add(0);
        resultComplement.add(1);
        resultComplement.add(2);
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
        assertEquals(new HashSet<>(resultUnion), bitset16.union(new HashSet<>(objects1)));
    }

    @Test
    public void testIntersection() {
        assertEquals(new HashSet<>(resultIntersection), bitset16.intersection(new HashSet<>(objects1)));
    }

    @Test
    public void testComplement() {
        assertEquals(new HashSet<>(resultComplement), bitset16.complement(new HashSet<>(objects1)));
    }
/*
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
*/}