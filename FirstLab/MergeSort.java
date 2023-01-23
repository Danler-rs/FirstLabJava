package FirstLab;

public class MergeSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();

        int[] arr = randArray.getRandomMassive();

        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

       mergesort(arr, arr.length);



        String res = randArray.printArray(arr);
        System.out.println(res);
    }

    public static void mergesort(int[] array, int length){
        if (length < 2){
            return;
        }

        int centr = length/2;
        int[] L = new int[centr];
        int[] R = new int[length-centr];

        for (int i = 0; i < centr; i++){
            L[i] = array[i];
        }
        for (int i = centr; i < length; i++){
            R[i-centr] = array[i];
        }

        mergesort(L, centr);
        mergesort(R, length-centr);

        merge(array, L, R, centr, length-centr);
    }
    public static void merge(int[] array, int[] L, int[] R, int left, int right){
        int i = 0, j = 0, k = 0;

        while (i < left && j < right){
            if (L[i] <= R[j]){
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < left){
            array[k++] = L[i++];
        }
        while (j < right){
            array[k++] = R[j++];
        }
    }
}
