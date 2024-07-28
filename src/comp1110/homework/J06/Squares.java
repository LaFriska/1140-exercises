package comp1110.homework.J06;

public class Squares {

    static void allSquares(int to){
        int i = 1;
        while(i * i <= to){
            System.out.println(i * i);
            i++;
        }
    }

}
