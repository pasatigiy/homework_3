import java.util.Arrays;
import java.util.Scanner;

public class TheTask2 {
    public static void main(String[] args) {
        System.out.println("Please enter the size of the array ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        double[] myArray = new double[size];
        for (int i = 0; i<size ; i++){
            myArray[i] = Math.random();
        }
        System.out.println(Arrays.toString(myArray));
        double min, max;
        min = max = myArray[0];

        for (int i = 1; i< myArray.length; i++){
            if (myArray[i] < min )
                min = myArray[i];
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        double averageValue ;
        double sum = 0;

        for ( int i = 0; i< myArray.length; i++){
            sum += myArray[i] ;
        }
        averageValue = sum/ myArray.length;


        System.out.println( " Min = " + min + ", Max = " + max + ", Average = " + averageValue + ";");
    }
}
