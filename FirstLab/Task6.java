package FirstLab;

public class Task6 {
    public String Digit_Palindrome(){
        String res = "";
        for (int i = 0; i*i < 1000000000; i++) {
            String tmp = "";
            if (isPalindrome(i) == 1) {
                tmp = "Num = " + i + " Stepen = " + i * i + "\n";
            }
            res += tmp;
        }
        return res;
    }
    public int isPalindrome(long x){
        long end = 0, nach = x*x;

        for (long i = x*x; i > 0; i /= 10) {
            end = end*10+(i%10);
        }
        if (end == nach) {
            return 1;
        }
        return 0;
    }
}