package FirstLab;
import java.util.Scanner;
public class TestTask3 {
    public String costOfDiscuss(){
        Scanner scan = new Scanner(System.in);

        Task3 t3 = new Task3();
        double resOfTask3;
        String resTestTask3;

        System.out.println("Введите время начала разговора от0 до 23 часов: ");
        int t = scan.nextInt();
        System.out.println("Введтите продолжительность разговора в минутах: ");
        int dt = scan.nextInt();
        System.out.println("Введите стоимость минуты разговора: ");
        int s = scan.nextInt();
        System.out.println("Введите день недели от 1 до 7: ");
        int d = scan.nextInt();

        resOfTask3 = t3.sumOfdiscuss(t, dt, s, d);
        resTestTask3 = "Стоимость разговора: " + resOfTask3;
        return resTestTask3;
    }
}
