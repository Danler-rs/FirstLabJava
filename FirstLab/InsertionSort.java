package FirstLab;
public class InsertionSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();

        int[] arr = randArray.getRandomMassive();

        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

        for (int i = 0; i < arr.length; i++){
           int num = arr[i];
           int j = i-1;
           for (; j >= 0; j-- ){
               if (num < arr[j]){
                   arr[j+1] = arr[j];
               } else {
                   break;
               }
           }
           arr[j+1] = num;
        }

        String res = randArray.printArray(arr);
        System.out.println(res);

    }
}
