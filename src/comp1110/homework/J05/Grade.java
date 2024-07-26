package comp1110.homework.J05;

public class Grade {

    static void printGrade(int mark){
        if(mark < 0 || mark > 100) System.out.println("Bad mark");
        else if(mark <= 49) System.out.println("N");
        else if(mark <= 59) System.out.println("P");
        else if(mark <= 69) System.out.println("C");
        else if(mark <= 79) System.out.println("D");
        else System.out.println("HD");
    }

}
