package FirstLab;

public class Task4 {
    public String znakZodiaka(int day, int month){

        String sign = "";

        if((month == 1) && (day <= 20) || (month == 12) && (day >= 22)) {
            sign = "Capricorn";
        } else if((month == 1) || (month == 2) && (day <= 19)) {
            sign = "Aquarius";
        } else if((month == 2) || (month == 3) && (day <= 20)) {
            sign = "Pisces";
        } else if((month == 3) || (month == 4) && (day <= 19)) {
            sign = "Aries";
        } else if((month == 4) || (month == 5) && (day <= 21)) {
            sign = "Taurus";
        } else if((month == 5) || (month == 6) && (day <= 21)) {
            sign = "Gemini";
        } else if((month == 6) || (month == 7) && (day <= 23)) {
            sign = "Cancer";
        } else if((month == 7) || (month == 8) && (day <= 23)) {
            sign = "Leo";
        } else if((month == 8) || (month == 9) && (day <= 23)) {
            sign = "Virgo";
        } else if((month == 9) || (month == 10) && (day <= 23)) {
            sign = "Libra";
        } else if((month == 10) || (month == 11) && (day <= 22)) {
            sign = "Scorpio";
        } else if(month == 12) {
            sign = "Sagittarius";
        }

        return sign;
    }
}
