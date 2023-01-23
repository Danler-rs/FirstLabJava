package FirstLab;

import java.util.Scanner;

public class TestTask1 {
    public String funktion (){
        Scanner scan = new Scanner(System.in);

        Task1 funktion1 = new Task1();


        System.out.println("Enter x and y for task 1: ");
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        double resultfunktion1;
        resultfunktion1 = funktion1.funktionWithSinAndLN(x1, y1);

        String resOfTask1 = "Result of funktion from task 1 = " + resultfunktion1;

        return resOfTask1;
    }
}
