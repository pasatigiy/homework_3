import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TheTask4 {
    public static void main(String[] args) {
        System.out.println("Please enter the size of the array ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if ( size>5 && size<=10){
            int[] myArray = new int[size];
            for ( int i = 0; i< myArray.length; i++){
                Random random = new Random();
                int num = random.nextInt(1000);
                myArray[i] = num;
//                myArray[i] = (int) Math.random();
//                System.out.println(Arrays.toString(myArray));
            } System.out.println(Arrays.toString(myArray));
        } else {
            System.out.println(" You are out of range ");
        }
    }
}
