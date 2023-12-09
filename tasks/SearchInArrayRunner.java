package tasks;

public class SearchInArrayRunner {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 20};

        try {
            System.out.println(SearchInArray.findElement(arr, 5));
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
