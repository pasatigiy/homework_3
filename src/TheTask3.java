import java.util.Arrays;

public class TheTask3 {
    public static void main(String[] args) {
        int[] myArray1 = { 5, 12, 7 ,65, 4};
        int[] myArray2 = { 5, 20, 7, 65, 4};
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));
        int average1, average2;
        int sum1 = 0, sum2 = 0;

        for ( int i = 0; i< myArray1.length; i++){
            sum1 += myArray1[i];
        }
        average1 = sum1/ myArray1.length;

        for ( int i = 0; i< myArray2.length; i++){
            sum2 += myArray2[i];
        }
        average2 = sum2/ myArray2.length;

        if ( average1 > average2){
            System.out.println( " average1 > average2");
        } else {
            if ( average1 < average2){
                System.out.println(" average1 < average2");
            } else {
                System.out.println( " average1 = average2 ");
            }
        }
    }
}
