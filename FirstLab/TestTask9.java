package FirstLab;
public class TestTask9 {
    public String thirdMass() {
        RandArray randArray = new RandArray();
        Task9 t9 = new Task9();

        int[] array1 = randArray.getRandomMassive();
        int[] array2 = randArray.getRandomMassive();
        int[] array3 = t9.thirdArrOfTwoArray(array1, array2);
        String res = "", str_arr1 = "", str_arr2 = "";

        System.out.println("Первый массив");
        str_arr1 = randArray.printArray(array1);
        System.out.println(str_arr1);

        System.out.println("Второй массив");
        str_arr2 = randArray.printArray(array2);
        System.out.println(str_arr2);

        System.out.println("Итоговый массив из первых двух");
        res = randArray.printArray(array3);
        return res;
    }
}
