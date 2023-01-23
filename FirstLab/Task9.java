package FirstLab;
import java.util.Arrays;
public class Task9 {
    public int[] thirdArrOfTwoArray(int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length+arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++){
            tmp[i] = arr1[i];
            k++;
        }
        for (int j = 0; j < arr2.length; j++){
            tmp[k++] = arr2[j];
        }

        Arrays.sort(tmp);
        return tmp;
    }

    public int[] increaseSize(int[] original) {
        int[] temp = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            temp[i] = original[i];
        }
        original = temp;
        return original;
    }
}