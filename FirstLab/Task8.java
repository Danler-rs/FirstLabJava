package FirstLab;

public class Task8 {
    public int[] getArrayWithoutDubls(int[] arr, int n) {
        boolean isNotContains;
        int[] tmp = new int[1];
        tmp[0] = arr[0];

        for (int i = 1; i < arr.length; i++){
            isNotContains = true;
            for (int j = 0; j < tmp.length; j++){
                if (arr[i] == tmp[j]){
                    isNotContains = false;
                }
            }
            if (isNotContains){
                tmp = increaseSize(tmp);
                tmp[tmp.length-1] = arr[i];
            }

        }
        return tmp;
    }
    public static int[] increaseSize(int[] original) {
        int[] temp = new int[original.length + 1];

        for (int i = 0; i < original.length; i++){
            temp[i] = original[i];
        }
        original = temp;
        return original;
    }

}
