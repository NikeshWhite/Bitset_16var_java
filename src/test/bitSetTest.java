package test;

import bitset.bitSet;
import bitset.basicOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class bitSetTest {

    @Test
    public void getSize() {
        bitSet a = new bitSet(3);
        bitSet z = new bitSet(0);
        assertEquals(3, a.getSize());
        assertEquals(0, z.getSize());
    }

    @Test
    public void getElements() {
       /* bitSet a = new bitSet(3);
        a.addElement(0);
        a.addElement(1);
        a.addElement(2);

        boolean[] result1 = new boolean[3];


        assertEquals(result1, a.getElements());*/
    }

    @Test
    public void addElement() {
        bitSet a = new bitSet(5);
        a.addElement(0);
        a.addElement(4);

        assertTrue(a.checkElement(0));
        assertFalse(a.checkElement(2));
    }

    @Test
    public void addArrayOfElements() {
        bitSet a = new bitSet(5);
        int[] array1 = {1, 3, 4};
        a.addArrayOfElements(array1);

        assertTrue(a.checkElement(1));
        assertFalse(a.checkElement(2));
        assertTrue(a.checkElement(3));
    }

    @Test
    public void deleteElement() {
        bitSet a = new bitSet(5);
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
        bitSet a = new bitSet(5);;
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
        bitSet a = new bitSet(5);
        a.addElement(1);
        a.addElement(2);
        a.addElement(3);

        assertEquals(true, a.checkElement(1));
        assertEquals(false, a.checkElement(4));
    }

    @Test
    public void union() {
        bitSet a = new bitSet(5);
        bitSet b = new bitSet(22);
        bitSet x = new bitSet(2);
        bitSet z = new bitSet(7);
        bitSet result1 = new bitSet(7);
        bitSet result2 = new bitSet(7);
        bitSet result3 = new bitSet(22);

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

        assertEquals(result1, basicOperations.union(a, z));
        assertEquals(result2, basicOperations.union(x, z));
        assertEquals(result3, basicOperations.union(b, a));
    }

    @Test
    public void intersection() {

        bitSet a = new bitSet(1);
        bitSet b = new bitSet(5);
        bitSet x = new bitSet(8);
        bitSet z = new bitSet(22);
        bitSet result1 = new bitSet(1);
        bitSet result2 = new bitSet(5);
        bitSet result3 = new bitSet(8);

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 7};
        int[] arrayResult2 = {3, 4};


        b.addArrayOfElements(array1);
        x.addArrayOfElements(array2);
        z.addElement(21);
        result2.addArrayOfElements(arrayResult2);

        assertEquals(result1, basicOperations.intersection(a, b));
        assertEquals(result2, basicOperations.intersection(b, x));
        assertEquals(result2, basicOperations.intersection(x, b));
        assertEquals(result3, basicOperations.intersection(x, z));
    }

    @Test
    public void complement() {

        bitSet a = new bitSet(8);
        bitSet b = new bitSet(6);
        bitSet result1 = new bitSet(8);

        int[] array1 = {1, 2, 3, 7};
        int[] array2 = {3, 4, 5};
        int[]arrayRresult1 = {1, 2, 7};

        a.addArrayOfElements(array1);
        b.addArrayOfElements(array2);
        result1.addArrayOfElements(arrayRresult1);

        assertEquals(result1, basicOperations.complement(a, b));

    }

}