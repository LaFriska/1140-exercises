package comp1110.homework.J05;

public class Movie {

    static void printRunningTime(String title, int minutes){
        int mins = minutes % 60;
        int hours = minutes / 60;

        String minuteString = mins == 1 ? "minute" : "minutes"; //ternary operation e.g int i = condition ? 1 : 0
        String hoursString = hours == 1 ? "hour" : "hours";

        if(hours == 0 && mins == 0)
            System.out.println(title + " is empty.");
        else if(hours != 0 && mins == 0)
            System.out.println(title + " runs for " + hours + " " + hoursString);
        else if(hours == 0 && mins != 0)
            System.out.println(title + " runs for " + mins + " " + minuteString);
        else
            System.out.println(title + " runs for " + hours + " " + hoursString + " and " + mins + " " + minuteString);
    }
}
