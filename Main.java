import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myArray= {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(myArray));
        reversedArray(myArray);
        System.out.println(Arrays.toString(myArray));


    }


    private static int[]reversedArray(int[]array){

        int maxIndex = array.length-1;
        int halfArray= array.length/2;

        for(int i=0;i<halfArray;i++){
            int temp=0;
            temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
        return array;
    }
}