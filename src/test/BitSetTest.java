package test;

import bitset.BitSet;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BitSetTest {

    @Test
    public void getSize() {
        BitSet a = new BitSet(3);
        BitSet z = new BitSet(0);
        assertEquals(3, a.getSize());
        assertEquals(0, z.getSize());
    }

    @Test
    public void getElements() {
        BitSet a = new BitSet(3);
        a.addElement(0);
        a.addElement(1);
        a.deleteElement(1);
        a.addElement(2);

        boolean[] result1 = new boolean[3];
        result1[0] = true;
        result1[1] = false;
        result1[2] = true;

        BitSet z = new BitSet(3);
        z.addElement(2);
        z.deleteElement(2);
        z.addElement(2);

        boolean[] result2 = new boolean[3];
        result2[0] = false;
        result2[1] = false;
        result2[2] = true;

        assertEquals(Arrays.toString(result1), Arrays.toString(a.getElements()));
        assertEquals(Arrays.toString(result2), Arrays.toString(z.getElements()));
    }

    @Test
    public void addElement() {
        BitSet a = new BitSet(5);
        a.addElement(0);
        a.addElement(4);

        assertTrue(a.checkElement(0));
        assertFalse(a.checkElement(2));
    }

    @Test
    public void addArrayOfElements() {
        BitSet a = new BitSet(5);
        int[] array1 = {1, 3, 4};
        a.addArrayOfElements(array1);

        assertTrue(a.checkElement(1));
        assertFalse(a.checkElement(2));
        assertTrue(a.checkElement(3));
    }

    @Test
    public void deleteElement() {
        BitSet a = new BitSet(5);
        a.addElement(4);
        a.addElement(1);
        a.deleteElement(1);
        a.deleteElement(4);
        a.addElement(4);

        assertFalse(a.checkElement(1));
        assertTrue(a.checkElement(4));
    }

    @Test
    public void deleteArrayOfElements() {
        BitSet a = new BitSet(5);;
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {0, 1};
        int[] array3 = {3, 4};

        a.addArrayOfElements(array1);
        a.deleteArrayOfElements(array2);
        a.deleteArrayOfElements(array3);

        assertFalse(a.checkElement(1));
        assertTrue(a.checkElement(2));
        assertFalse(a.checkElement(4));
    }

    @Test
    public void checkElement() {
        BitSet a = new BitSet(5);
        a.addElement(1);
        a.addElement(2);
        a.addElement(3);

        assertTrue(a.checkElement(1));
        assertFalse(a.checkElement(4));
    }

    @Test
    public void union() {
        BitSet a = new BitSet(5);
        BitSet b = new BitSet(22);
        BitSet x = new BitSet(2);
        BitSet z = new BitSet(7);
        BitSet result1 = new BitSet(7);
        BitSet result2 = new BitSet(7);
        BitSet result3 = new BitSet(22);

        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 4, 5, 6};
        int[] arrayResult1 = {1, 2, 3, 4, 5, 6};
        int[] arrayResult2 = {0, 3, 4, 5, 6};
        int[] arrayResult3 = {1, 2, 3, 21};

        b.addElement(21);
        x.addElement(0);
        a.addArrayOfElements(array1);
        z.addArrayOfElements(array2);
        result1.addArrayOfElements(arrayResult1);
        result2.addArrayOfElements(arrayResult2);
        result3.addArrayOfElements(arrayResult3);

        assertEquals(result1, BitSet.union(a, z));
        assertEquals(result2, BitSet.union(x, z));
        assertEquals(result3, BitSet.union(b, a));
    }

    @Test
    public void intersection() {

        BitSet a = new BitSet(1);
        BitSet b = new BitSet(5);
        BitSet x = new BitSet(8);
        BitSet z = new BitSet(22);
        BitSet result1 = new BitSet(1);
        BitSet result2 = new BitSet(5);
        BitSet result3 = new BitSet(8);

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 7};
        int[] arrayResult2 = {3, 4};


        b.addArrayOfElements(array1);
        x.addArrayOfElements(array2);
        z.addElement(21);
        result2.addArrayOfElements(arrayResult2);

        assertEquals(result1, BitSet.intersection(a, b));
        assertEquals(result2, BitSet.intersection(b, x));
        assertEquals(result2, BitSet.intersection(x, b));
        assertEquals(result3, BitSet.intersection(x, z));
    }

    @Test
    public void complement() {

        BitSet a = new BitSet(8);
        BitSet b = new BitSet(6);
        BitSet result1 = new BitSet(8);
        BitSet result2 = new BitSet(6);

        int[] array1 = {1, 2, 3, 7};
        int[] array2 = {3, 4, 5};
        int[] arrayResult1 = {1, 2, 7};


        a.addArrayOfElements(array1);
        b.addArrayOfElements(array2);
        result1.addArrayOfElements(arrayResult1);
        result2.addElement(4);
        result2.addElement(5);

        assertEquals(result1, BitSet.complement(a, b));
        assertEquals(result2, BitSet.complement(b, a));
    }

}