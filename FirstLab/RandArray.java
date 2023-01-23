package FirstLab;

import java.util.Random;
import java.util.Scanner;
public class RandArray {
    public int[] getRandomMassive(){
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int sizeOfArray, numberOrigin, numberBound;

        System.out.println("1-Введите размер массива. 2-Введите первую границу диапозона случайных чисел. 3-Введите вторую границу диапозона случайных чисел");
        sizeOfArray = s.nextInt();
        numberOrigin = s.nextInt();
        numberBound = s.nextInt();


        int[] array = random.ints(sizeOfArray, numberOrigin, numberBound).toArray();
        return array;
    }

    public String printArray(int[] arr){
        String res = "";
        for (int i = 0; i < arr.length; i++){
            res = res + arr[i] + " ";
        }
        return res;
    }


}
