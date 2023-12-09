package tasks;

import java.util.Scanner;

public class IndexOut {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный индекс");
        }
    }
}
