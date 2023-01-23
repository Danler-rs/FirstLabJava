package FirstLab;
import java.util.Scanner;
public class TestTask10 {
    public String numOfUsingEveryCharInString(){
        Scanner scan = new Scanner(System.in);
        Task10 t10 = new Task10();
        String res = "", str_start = "";

        System.out.println("Enter eny string: ");
        str_start = scan.nextLine();

        for (int i = 0; i < str_start.length(); i++) {
            res = res + str_start.charAt(i) + " = " + t10.countOccurrences(str_start, str_start.charAt(i)) + "\n";
        }
        return res;
    }
}
