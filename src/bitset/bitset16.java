package bitset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class bitset16 {

    private int size;
    private Object[] elements;

    public bitset16(int size) {
        this.size = size;
        this.elements = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public void addElement (Object element) {
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Нет места в массиве");
    }

    public void deleteElement (Object element) {
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == element) {
                elements[i] = null;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Заданный элемент в массиве отсутствует");
    }

    public boolean checkElement (Object element) {
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == element) return true;
        }
        return false;
    }

    public Set<Object> union (Object[] other) {

        Set<Object> elementsSet = new HashSet<>(Arrays.asList(elements));

        Set<Object> result = new HashSet<>(Arrays.asList(other));
        result.addAll(elementsSet);

        return result;
    }

    public Set<Object> intersection(Object[] other) {

        Set<Object> elementsSet = new HashSet<>(Arrays.asList(elements));

        Set<Object> result = new HashSet<>(Arrays.asList(other));
        result.retainAll(elementsSet);

        return result;
    }

    public Set<Object> complement(Object[] other) {

        Set<Object> elementsSet = new HashSet<>(Arrays.asList(elements));

        Set<Object> result = new HashSet<>(Arrays.asList(other));
        result.removeAll(elementsSet);

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
        bitset16 bitSet = (bitset16) o;
        return size == bitSet.size &&
                Arrays.equals(elements, bitSet.elements);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }
}