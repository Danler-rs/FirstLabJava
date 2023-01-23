package FirstLab;

public class Task3 {
    public double sumOfdiscuss (int t, int dt, int s, int d){
        double sum = 0, ds;

        for (; dt > 0; dt -= 60){
            ds = 1;
            if ((t >= 22) || (t < 8)){
                ds -= 0.2;
            }
            if (d > 5){
                ds -= 0.1;
            }

            if (dt > 60){
                ds *= 60 * s;
                if ( ++t == 24){
                    t = 0;
                    if (++d == 8){
                        d = 1;
                    }
                }
            }
            else {
                ds *= dt * s;
            }

            sum += ds;
        }

        return sum;
    }
}
