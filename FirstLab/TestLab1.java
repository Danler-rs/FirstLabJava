package FirstLab;
import java.util.Scanner;
public class TestLab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter num of task: ");
        int numTask = scan.nextInt();

        switch (numTask) {
            case 1 -> {
                TestTask1 tt1 = new TestTask1();
                String res1;
                res1 = tt1.funktion();
                System.out.println(res1);
            }
            case 2 -> {
                TestTask2 tt2 = new TestTask2();
                String res2;
                res2 = tt2.dataSec();
                System.out.println(res2);
            }
            case 3 -> {
                TestTask3 tt3 = new TestTask3();
                String res3;
                res3 = tt3.costOfDiscuss();
                System.out.println(res3);
            }
            case 4 -> {
                TestTask4 tt4 = new TestTask4();
                String res4;
                res4 = tt4.inputZodiak();
                System.out.println(res4);
            }
            case 5 -> {
                TestTask5 tt5 = new TestTask5();
                String res5;
                res5 = tt5.inputSumOfRow();
                System.out.println(res5);
            }
            case 6 -> {
                Task6 t6 = new Task6();
                String res6;
                res6 = t6.Digit_Palindrome();
                System.out.println(res6);
            }
            case 7 ->{
                TestTask7 tt7 = new TestTask7();
                String res7;
                res7 = tt7.inputSumOfRowWithAccuracy();
                System.out.println(res7);
            }
            case 8 ->{
                TestTask8 tt8 = new TestTask8();
                String res8;
                res8 = tt8.arrayWithoutDubles();
                System.out.println(res8);
            }
            case 9 ->{
                TestTask9 tt9 = new TestTask9();
                String res9;
                res9 = tt9.thirdMass();
                System.out.println(res9);
            }
            case 10 ->{
                TestTask10 tt10 = new TestTask10();
                String res10;
                res10 = tt10.numOfUsingEveryCharInString();
                System.out.println(res10);
            }
            case 11->{
                TestTask11 tt11 = new TestTask11();
                String res11;
                res11 = tt11.longestPalindromeInStr();
                System.out.println(res11);
            }


        }




    }
}
