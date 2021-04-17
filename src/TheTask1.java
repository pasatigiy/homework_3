import java.util.Arrays;
import java.util.Scanner;

public class TheTask1 {
    public static void main(String[] args) {
        int[] array = { 8, 12, 7, 1, 38, 199 };
        System.out.println("Please enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Arrays.sort(array);
        int index = Arrays.binarySearch(array, number );
        if ( index < 0){
            System.out.println(" The given number is not included in the array. ");
        } else {
            for ( int i = 0; i < array.length ; i++){
                if ( array[i] == number){
                    array[i] = 0;
                }
            }
            System.out.println( Arrays.toString(array));

        }

    }
}
