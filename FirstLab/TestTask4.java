package FirstLab;
import java.util.Scanner;
public class TestTask4 {
    public String inputZodiak(){
        Scanner scan = new Scanner(System.in);

        Task4 t4 = new Task4();
        String resOfInputZodiak;
        int day, month;

        System.out.println("Введите день (1-31): ");
        day = scan.nextInt();
        System.out.println("Введите месяц (1-12): ");
        month = scan.nextInt();

        resOfInputZodiak = t4.znakZodiaka(day, month);
        return resOfInputZodiak;
    }
}
