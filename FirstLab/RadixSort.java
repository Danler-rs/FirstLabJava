package FirstLab;

public class RadixSort {
    public static void main(String[] args) {
        RandArray randArray = new RandArray();

        int[] arr = randArray.getRandomMassive();

        String start_arr = randArray.printArray(arr);
        System.out.println(start_arr);

        String res = randArray.printArray(radixsort(arr));
        System.out.println(res);
    }

    public static int numberOfDigits(int num){
        int i = 1;
        long n = 10;
        for (; num >= n;){
            i++;
            n *= 10;
        }
        return i;
    }

    public static int findMaxNumOfDigit(int[] nums){
        int res= 1;
        for (int i =0; i < nums.length; i++){
            int digits = numberOfDigits(nums[i]);
            if (digits > res){
                res = digits;
            }
        }
        return res;
    }

    public static int getDigit(int number, int devider){
        return number % (devider * 10) / (devider);
    }

    public static int[] findMinMaxKey(int[] numbers, int devider){
        int minKey = getDigit(numbers[0], devider);
        int maxKey = minKey;
        for (int number : numbers){
            int digit = getDigit(number, devider);
            if (digit < minKey){
                minKey = digit;
            }
            if (digit > maxKey){
                maxKey = digit;
            }
        }
        return new int[] {minKey, maxKey};
    }
    public static int[] countSort(int[] numbers, int devider){
        int[] minMaxKey = findMinMaxKey(numbers, devider);
        int minKey = minMaxKey[0], maxKey = minMaxKey[1];
        int n = maxKey-minKey + 1;
        int[] temp_arr = new int[n];
        for (int number : numbers){
            temp_arr[getDigit(number, devider)-minKey] += 1;
        }
        int size = numbers.length;
        for (int i = temp_arr.length-1; i >= 0; i--){
            size -= temp_arr[i];
            temp_arr[i] = size;
        }
        int[] res = new int[numbers.length];
        for (int number : numbers){
            res[temp_arr[getDigit(number, devider) - minKey]] = number;
            temp_arr[getDigit(number, devider) - minKey] += 1;
        }
        return res;
    }

    public static int[] radixsort(int[] array){
        int maxNumberOfDigits = findMaxNumOfDigit(array);
        int devider = 1;
        for (int i = 0; i < maxNumberOfDigits; i++){
            array = countSort(array, devider);
            devider *= 10;
        }
        return array;
    }
}
