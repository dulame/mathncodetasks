package tasks;

class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException() {
    }

    public ElementNotFoundException(String message) {
        super(message);
    }
}

public class SearchInArray {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == target) return i;
        }

        throw new ElementNotFoundException("Элемент не найден");
    }
}
