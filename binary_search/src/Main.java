import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        //int[] originalArray = {1, 2, 3,4,5};
        int[] originalArray = new int[100000000];
        for(int i=0; i<100000000; i++){
            originalArray[i] = i+1;
        }
        System.out.println(binarySearch(originalArray, 4900));
    }

    public static int binarySearch(int[] originalArray, int valueToSearch){
        var startIndex = 0;
        var endIndex = originalArray.length - 1;
        int mid = 0;
        int operacion = 0;
        while(startIndex <= endIndex){
            mid = (endIndex+startIndex)/2;
            long currentValue = originalArray[mid];
            if(currentValue == valueToSearch){
               return mid;
            } else if (currentValue > valueToSearch) {
                endIndex =  mid-1;
            } else {
                startIndex = mid+1;
            }
            operacion++;
            System.out.println("operacion #" + operacion);
        }
        return -1;
    }


}