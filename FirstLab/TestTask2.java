package FirstLab;
import java.util.Scanner;
public class TestTask2 {
    public String dataSec(){
        Scanner scan = new Scanner(System.in);

        Task2 t2 = new Task2();
        String resOfTask2;

        System.out.println("Enter seconds (int): ");
        int sec = scan.nextInt();


        resOfTask2 = t2.datefromsec(sec);
        return resOfTask2;
    }
}
