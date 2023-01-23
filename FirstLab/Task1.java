package FirstLab;
import java.util.Scanner;
public class Task1 {

    public double funktionWithSinAndLN(double x, double y){
        double chis = Math.sqrt( Math.pow((2+y), 2) + Math.pow(Math.sin(y+5.0), 1/7.0));
        double znam = Math.log(x+1)-Math.pow(y, 3.0);
        double funktion = chis/znam;

        return funktion;
    }
}
