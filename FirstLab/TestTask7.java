package FirstLab;
import java.util.Scanner;
public class TestTask7 {
    public String inputSumOfRowWithAccuracy(){
        Scanner scan = new Scanner(System.in);

        Task7 t7 = new Task7();
        String res;

        System.out.println("Enter x: ");
        double x = scan.nextDouble();
        System.out.println("Enter number of members: ");
        int n = scan.nextInt();

        res = "Сумма членов ряда с заданной точностью " + n + " = " + t7.sumOfRow(x,n);
        return res;
    }

}
