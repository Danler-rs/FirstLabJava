package FirstLab;
import java.util.Scanner;
import java.util.Random;
public class TestTask8 {
    public static int[] getRandomMassive(){
        Random random = new Random();
        int[] array = random.ints(10, -10, 10).toArray();
       return array;
    }

    public static String printArray(int[] arr){
        String res = "";
        for (int i = 0; i < arr.length; i++){
            res = res + arr[i] + " ";
        }
        return res;
    }

    public String arrayWithoutDubles(){
        Task8 t8 = new Task8();
        String result = "";

        int[] start_arr = getRandomMassive();
        result = "Массив изначальный: \n" + printArray(start_arr);

        int length_of_start_arr = start_arr.length;
        int[] clear_arr = t8.getArrayWithoutDubls(start_arr, length_of_start_arr);
        result = result +"\n" + "Массив без повторов: \n" + printArray(clear_arr);
        return result;
    }


}
