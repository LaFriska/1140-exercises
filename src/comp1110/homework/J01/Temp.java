package comp1110.homework.J01;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the area of a square whose side length is 10?");
        //try-catch statement
        int answer = Integer.parseInt(scanner.nextLine());
        if(answer == 100) System.out.println("Correct!");
        else System.out.println("Wrong!");

    }
}
