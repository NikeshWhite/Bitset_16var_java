package bitset;

import java.util.Arrays;

public class bitSet {

    private boolean[] elements;

    public bitSet(int size) {
        this.elements = new boolean[size];
    }

    public int getSize() {
        return elements.length;
    }

    public boolean[] getElements(){
        return elements;
    }

    public void addElement (int element) {
       elements[element] = true;
    }

    public void addArrayOfElements (int[] element) {
        for (int i = 0; i < element.length; i++) {
            elements[element[i]] = true;
        }
    }

    public void deleteElement (int element) {
        elements[element] = false;
    }

    public void deleteArrayOfElements (int[] element) {
        for (int i = 0; i < element.length; i++) {
            elements[element[i]] = false;
        }
    }

    public boolean checkElement (int element) {
        return elements[element];
    }


    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bitSet bitSet = (bitSet) o;
        return Arrays.equals(elements, bitSet.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }
}
