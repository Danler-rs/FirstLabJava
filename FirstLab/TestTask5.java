package FirstLab;
import java.util.Scanner;
public class TestTask5 {
    public String inputSumOfRow(){
        Scanner scan = new Scanner(System.in);

        Task5 t5 = new Task5();
        String res = "";

        System.out.println("Введите х: ");
        double x = scan.nextDouble();
        System.out.println("Введите n: ");
        int n = scan.nextInt();
        res = "Сумма ряда = " + t5.Sum(x, n);
        return res;
    }
}
