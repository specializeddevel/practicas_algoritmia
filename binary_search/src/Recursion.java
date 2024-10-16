import java.util.ArrayList;
import java.util.List;

public class Recursion {

    public static void main(String[] args) {
        counterdown(3);
        System.out.println();
        counterdown(10);
        System.out.println();
        System.out.println(factorial(1));
        List<Integer> sumar  = List.of(-11, -2, -233, -42, 5,-6,-17,-82,-164);
        System.out.println(sumArray(sumar));
        System.out.println(countItems(sumar));
        System.out.println(maxElement(sumar,0));
        System.out.println(max(sumar));
    }

    public static void counterdown(int i) {
        System.out.print(i);
        if (i <= 1) {
            return;
        } else {
            counterdown(i - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    //Sum elements in an array using recursion
    public static int sumArray(List<Integer> originalarray){
        if(originalarray.size() == 0){
            return 0;
        } else {
            return originalarray.get(0) + sumArray(originalarray.subList(1, originalarray.size()));
        }
    }

    public static int countItems(List<Integer> originalarray){
        if(originalarray.size() == 0){
            return 0;
        } else {
            return 1 + countItems(originalarray.subList(1, originalarray.size()));
        }
    }

    public static int maxElement(List<Integer> originalarray, int max){
        if(originalarray.size() == 0){
            return max;
        } else {
            if (originalarray.get(0) > max) {
                return maxElement(originalarray.subList(1, originalarray.size()), originalarray.get(0));
            } else {
                return maxElement(originalarray.subList(1, originalarray.size()), max);
            }

        }
    }

    public static int max(List<Integer> list){
        if(list.size() == 2) {
            if(list.get(0) > list.get(1)) return list.get(0);
            return list.get(1);
        }
        int subMax = max(list.subList(1,list.size()));
        if(list.get(0)> subMax) return list.get(0);
        return subMax;
    }
}
