package FirstLab;

public class Task2 {
    public String datefromsec(int sec){
        int days = sec / 86400;
        int ds = sec % 86400;
        int hours = ds / 3600;
        ds = ds % 3600;
        int mins = ds / 60;
        int seconds = ds % 60;
        String data = sec + " seconds is: " + days + " days, " + hours + " hours, " + mins + " minutes, " + seconds + " seconds";
        return data;
    }
}
