package comp1110.homework.J05;

public class Movie {

    static void printRunningTime(String title, int minutes){
        int remainder = minutes % 60;
        int hours = minutes / 60;
        if(hours == 0) System.out.println(title + " runs for " + remainder + " " + getPlural(remainder, "minute"));
        else System.out.println(title + " runs for " + hours + " " + getPlural(hours, "hour")
                + (remainder  == 0 ? "" : " and " + remainder + " " + getPlural(remainder, "minute")));

    }

    static private String getPlural(int quantity, String word){
        if(quantity > 1) return word + 's';
        return word;
    }

}
