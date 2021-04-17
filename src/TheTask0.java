import java.util.Arrays;
import java.util.Scanner;

public class TheTask0 {
    public static void main(String[] args) {
        int[] array = { 5, 10, 7, 22, 38, 74 };
        System.out.println("Please enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Arrays.sort(array);
        int index = Arrays.binarySearch(array, number);
        if ( index >= 0){
            System.out.println(" The given number is included in the array. ");
        } else {
            System.out.println(" The given number is not included in the array. ");
        }
    }
}
