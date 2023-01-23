package FirstLab;
public class SelectionSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();
        SwapArrayNums swap = new SwapArrayNums();

        int[] arr = randArray.getRandomMassive();
        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

        for (int i = 0; i < arr.length; i++){
            int min_ind = i;
            for (int j = min_ind; j < arr.length; j++){
                if (arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            swap.swap(arr, i, min_ind);
        }

        String res = randArray.printArray(arr);
        System.out.println(res);
    }
}
