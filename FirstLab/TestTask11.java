package FirstLab;
import java.util.Scanner;
public class TestTask11 {
    public String longestPalindromeInStr(){
        Scanner scan = new Scanner(System.in);
        Task11 t11 = new Task11();
        String start_str = "", res = "";

        System.out.println("Enter any string: ");
        start_str = scan.nextLine();

        res = res + t11.longestPalindrome(start_str);

        return res;
    }
}
