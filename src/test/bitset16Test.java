package test;

import bitset.bitset16;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class bitset16Test {

    @Test
    public void getSize() {
        bitset16 a = new bitset16(3);
        assertEquals(3, a.getSize());
    }

    @Test
    public void addElement() {
        bitset16 a = new bitset16(2);
        a.addElement(334);
        a.addElement("Earth");

        assertNotNull(a);
    }

    @Test
    public void deleteElement() {
        bitset16 a = new bitset16(2);
        a.addElement(22);
        a.deleteElement(22);

        assertFalse(a.checkElement(22));
    }

    @Test
    public void checkElement() {
        bitset16 a = new bitset16(3);
        a.addElement(1);
        a.addElement("BB");
        a.addElement("G1");

        assertTrue(a.checkElement(1));
        assertFalse(a.checkElement("F2"));
        assertTrue(a.checkElement("G1"));
    }

    @Test
    public void union() {
        bitset16 a = new bitset16(3);
        a.addElement(1);
        a.addElement(22);
        a.addElement(333);

        Object[] x = new Object[]{"A", "BB", "CCC"};

        Set<Object> result = new HashSet<>();
        result.add(1);
        result.add(22);
        result.add(333);
        result.add("A");
        result.add("BB");
        result.add("CCC");

        assertEquals(result, a.union(x));
    }

    @Test
    public void intersection() {

        bitset16 a = new bitset16(3);
        a.addElement(1);
        a.addElement(22);
        a.addElement("CCC");

        Object[] x = new Object[]{4, "22", "CCC"};

        Set<Object> result = new HashSet<>();
        result.add("CCC");

        assertEquals(result, a.intersection(x));
    }

    @Test
    public void complement() {
        bitset16 a = new bitset16(3);
        a.addElement(1);
        a.addElement(22);
        a.addElement(555);

        Object[] x = new Object[]{1, 22, "CCC", "BB"};

        Set<Object> result = new HashSet<>();
        result.add("BB");
        result.add("CCC");

        assertEquals(result, a.complement(x));
    }

}