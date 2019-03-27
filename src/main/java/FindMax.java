import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("enter a size less than 20");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size exceed 20");
            }
        } while (size > 20);
        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.println("enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("list");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
               index = j+1;
            }
        }
        System.out.printf("the max is %d at position %d", max, index);
    }
}
