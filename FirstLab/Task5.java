package FirstLab;

public class Task5 {
    public double Mul(int k){
        double res = 1.0;
        for (int i = 1; i <= k+7; i++){
            
            if (i == 7) continue;
            if (Math.pow(i, 3) == 27) continue;

            res *= (Math.pow(i, 3) - 27)/(i - 7);
        }
        return res;
    }

    public double Sum(double x, int n){
        double res = 0, tmp;

        for (double k = 3; k <= n; k++){
            tmp = (k-5) * Math.pow(x, k);
            if (tmp == 0) continue;
            tmp = (Math.pow(-2, k-1))/tmp;
            if (tmp == 0) continue;


            /*tmp = (Math.pow(-2, k-1));
            if (tmp == 0) continue;
            tmp = tmp/ ((k-5) * (Math.pow(x, k)));
            if (tmp == 0) continue;

             */
            res+= tmp * Mul((int) k);
        }
        return res;
    }
}
