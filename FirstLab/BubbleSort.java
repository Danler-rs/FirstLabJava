package FirstLab;
public class BubbleSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();
        SwapArrayNums swap = new SwapArrayNums();

        int[] arr = randArray.getRandomMassive();
        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    swap.swap(arr, i, i-1);
                    needIteration = true;

                }
            }
        }
        String res = randArray.printArray(arr);
        System.out.println(res);

    }
}
