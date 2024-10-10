import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> originalArray = new ArrayList<>();
        originalArray = List.of(1,7,8,-12, -105, 45, -895,4,121);

        List<Integer> sortedArray = sortArray(originalArray);
        System.out.println(sortedArray);


    }

    private static Integer findSmallPosition(List<Integer> array) {
        int min = array.get(0);
        int position = 0;
        for(int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
                position = i;
            }
        }
        return position;
    }

    private static List<Integer> sortArray(List<Integer> originalArray) {
        List copiedArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        copiedArray.addAll(originalArray);
        for(int i = 0; i < originalArray.size(); i++) {
            int positionSmall = findSmallPosition(copiedArray);
            newArray.add((Integer) copiedArray.get(positionSmall));
            copiedArray.remove(positionSmall);
            System.out.println(copiedArray);
        }
        return newArray;
    }

}
