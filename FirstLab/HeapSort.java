package FirstLab;

public class HeapSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();

        int[] arr = randArray.getRandomMassive();

        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

        String res = randArray.printArray(arr);
        System.out.println(res);
    }
}
