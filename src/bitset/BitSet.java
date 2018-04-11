package bitset;

import java.util.Arrays;

public class BitSet {

    private boolean[] elements;

    public BitSet(int size) {
        this.elements = new boolean[size];
    }

    public int getSize() {
        return elements.length;
    }

    public boolean[] getElements(){
        return elements;
    }

    public void addElement (int element) {
        if (element <= getSize()) {
            elements[element] = true;
        } else {
            throw new IllegalArgumentException("The element exceeds the maximum value");
        }
    }

    public void addArrayOfElements (int[] element) {
        for (int i = 0; i < element.length; i++) {
            addElement(element[i]);
        }
    }

    public void deleteElement (int element) {
        if (element <= getSize()) {
            elements[element] = false;
        } else {
            throw new IllegalArgumentException("The element exceeds the maximum value");
        }
    }

    public void deleteArrayOfElements (int[] element) {
        for (int i = 0; i < element.length; i++) {
            deleteElement(element[i]);
        }
    }

    public boolean checkElement (int element) {
        if (element <= getSize()) {
            return elements[element];
        } else {
            throw new IllegalArgumentException("The element exceeds the maximum value");
        }

    }

    public static BitSet union(BitSet firstArray, BitSet secondArray) {

        BitSet result = new BitSet(Math.max(firstArray.getSize(), secondArray.getSize()));

        for (int i = 0; i < secondArray.getSize(); i++) {
            if (secondArray.getElements()[i]) {
                result.getElements()[i] = true;
            }
        }

        for (int i = 0; i < firstArray.getSize(); i++) {
            if (firstArray.getElements()[i]) {
                result.getElements()[i] = true;
            }
        }
        return result;
    }

    public static BitSet intersection(BitSet firstArray, BitSet secondArray) {

        BitSet result = new BitSet(Math.min(firstArray.getSize(), secondArray.getSize()));

        for (int i = 0; i < Math.min(firstArray.getSize(), secondArray.getSize()); i++) {
            if (firstArray.getElements()[i] && secondArray.getElements()[i]) {
                result.getElements()[i] = true;
            }
        }
        return result;
    }

    public static BitSet complement(BitSet firstArray, BitSet secondArray) {

        BitSet result = new BitSet(firstArray.getSize());

        for (int i = 0; i < firstArray.getSize(); i++) {
            if (firstArray.getElements()[i]) {
                result.getElements()[i] = true;
            }
        }

        for (int i = 0; i < Math.min(firstArray.getSize(), secondArray.getSize()); i++) {
            if (firstArray.getElements()[i] == secondArray.getElements()[i]) {
                result.getElements()[i] = false;
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitSet BitSet = (bitset.BitSet) o;
        return Arrays.equals(elements, BitSet.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }
}
