package bitset;

public class basicOperations {

    public static bitSet union(bitSet firstArray, bitSet secondArray) {

        bitSet result = new bitSet(Math.max(firstArray.getSize(), secondArray.getSize()));

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

    public static bitSet intersection(bitSet firstArray, bitSet secondArray) {

        bitSet result = new bitSet(Math.min(firstArray.getSize(), secondArray.getSize()));

        for (int i = 0; i < Math.min(firstArray.getSize(), secondArray.getSize()); i++) {
            if (firstArray.getElements()[i] && secondArray.getElements()[i]) {
                result.getElements()[i] = true;
            }
        }
        return result;
    }

    public static bitSet complement(bitSet firstArray, bitSet secondArray) {

        bitSet result = new bitSet(firstArray.getSize());

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

}
