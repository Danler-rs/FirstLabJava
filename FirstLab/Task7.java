package FirstLab;

public class Task7 {
    public double sumOfRow (double x, int n){
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += ((i*2+1)*(Math.pow(x, i*2.0)))/(getFactorial(i));
        }
        return sum;
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
