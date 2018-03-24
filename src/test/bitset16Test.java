package test;
import bitset.bitset16;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class bitset16Test {

    bitset16 z = new bitset16(5);

    private static Set<String> objects1;
    static {
        objects1 = new HashSet<>();
        objects1.add("Object0");
        objects1.add("Object1");
        objects1.add("Object2");
        objects1.add("Some");
        objects1.add("Earth");
    }

    private static Set<String> resultUnion;
    static {
        resultUnion = new HashSet<>();
        resultUnion.add("Object0");
        resultUnion.add("Object1");
        resultUnion.add("Object2");
        resultUnion.add("Object3");
        resultUnion.add("Object4");
        resultUnion.add("Some");
        resultUnion.add("Earth");
    }

    private static Set<String> resultIntersection;
    static {
        resultIntersection = new HashSet<>();
        resultIntersection.add("Object0");
        resultIntersection.add("Object1");
        resultIntersection.add("Object2");}

    private static Set<String> resultComplement;
    static {
        resultComplement = new HashSet<>();
        resultComplement.add("Some");
        resultComplement.add("Earth");
    }
    
    private static Set<String> resultAdd;
    static {
        resultAdd = new HashSet<>();
        resultAdd.add("Object0");
        resultAdd.add("Object1");
        resultAdd.add("Object2");
        resultAdd.add("Object4");
        resultAdd.add("Some");
        resultAdd.add("Earth");
    }

    private static Set<String> resultRemove;
    static {
        resultRemove = new HashSet<>();
        resultRemove.add("Object0");
        resultRemove.add("Object1");
        resultRemove.add("Some");
        resultRemove.add("Earth");
    }

    @Test
    public void testUnion() {
        assertEquals(resultUnion, bitset16.union(objects1));
    }

    @Test
    public void testIntersection() {
        assertEquals(resultIntersection, bitset16.intersection(objects1));
    }

    @Test
    public void testComplement() {
        assertEquals(resultComplement, bitset16.complement(objects1));
    }

    @Test
    public void testAdd() {
        assertEquals(resultAdd, bitset16.add(objects1, 4));
    }

    @Test
    public void testRemove() {
        assertEquals(resultRemove, bitset16.remove(objects1, 2));
    }

    @Test
    public void testCheck() {
        assertTrue(bitset16.check(objects1, 2));
        assertFalse(bitset16.check(objects1, 4));
    }
}