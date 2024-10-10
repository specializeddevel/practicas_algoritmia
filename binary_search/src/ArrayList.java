import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<Integer> originalArray = new java.util.ArrayList<>();
        originalArray = List.of(1,2,3,4,5,6,7,8,9,10,15,105);
        System.out.println(binarySearch(originalArray, 6));
    }

    public static int binarySearch(List<Integer> originalArray, int valueToFind) {
        int low = 0;
        int max = originalArray.size() -1;
        if (valueToFind > originalArray.get(max)) {
            return -1;
        }
        int mid = 0;
        int operacion = 0;
        while (low <= max) {
            operacion++;
            mid = (low + max) / 2;
            int midVal = originalArray.get(mid);

            if (midVal == valueToFind) {
                System.out.println("Operaciones: " + operacion);
                return mid;
            } else if (midVal < valueToFind) {
                low = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println("Operaciones: " + operacion);
        return -1;
    }
}
