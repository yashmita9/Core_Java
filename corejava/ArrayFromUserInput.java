package In.com.corejava;
import java.util.Scanner;

public class ArrayFromUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        // Create an array of the specified size
        int[] array = new int[num];

        // Prompt the user to enter the elements
        System.out.println("Enter " + num + " integers: ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        // Display the contents of the array
        System.out.println("You entered the following integers: ");
        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }

        // Close the scanner
        sc.close();
    }
}
