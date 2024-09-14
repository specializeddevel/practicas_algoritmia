public class RotateArray {

    /*
    * Problem: Rotate an array of n elements to the right by k steps. For example, with n
    * = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
    * */

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int steps = 7;

        array = rotateArray(array, steps);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

    public static int[] rotateArray(int[] arr, int steps) {

        if(steps>arr.length)
            steps=steps%arr.length;

        System.out.println(steps);

        int[] result = new int[arr.length];
        for (int i = 0; i < steps; i++) {
            result[i] = arr[i + (arr.length - steps)];
        }

        for(int j=steps; j<arr.length; j++) {
            result[j] = arr[j-steps];
        }

        return result;
    }
}
