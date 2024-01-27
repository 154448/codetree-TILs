import java.util.Scanner;
import java.util.Arrays;

class Forecast implements Comparable<Forecast>{
    int year;
    int month;
    int day;

    String week;
    String weather;

    public Forecast(String date, String week, String weather){
        this.week = week;
        this.weather = weather;

        String[] tmp = date.split("-");
        this.year = Integer.valueOf(tmp[0]);
        this.month = Integer.valueOf(tmp[1]);
        this.day = Integer.valueOf(tmp[2]);
    }

    public String getDate(){
        return String.valueOf(year) + "-"+ (month < 10 ? "0" : "") + String.valueOf(month) + "-" + String.valueOf(day);
    }

    @Override
    public int compareTo(Forecast otherDay){
        int yearCompare = Integer.compare(this.year, otherDay.year);
        if(yearCompare != 0){
            return yearCompare;
        }
        int monthCompare = Integer.compare(this.month, otherDay.month);
        if(monthCompare != 0){
            return monthCompare;
        }
        return Integer.compare(this.day, otherDay.day);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        userIn.nextLine();

        Forecast[] forecasts = new Forecast[n];

        for(int i = 0; i < n; i++){
            String tmp = userIn.nextLine();
            String[] info = tmp.split(" ");

            //System.out.printf("%s\n", info[1]);
            forecasts[i] = new Forecast(info[0], info[1], info[2]);
        }

        Arrays.sort(forecasts);

        for(int i = 0; i < n; i++){
            if(forecasts[i].weather.equals("Rain")){
                System.out.printf("%s %s %s", forecasts[i].getDate(), forecasts[i].week, forecasts[i].weather);
                break;
            }
        }
    }
}