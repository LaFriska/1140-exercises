package comp1110.homework.J06;

public class Squares {

//    static void allSquares(int to){
//        int tracker = 1;
//        for(int i = 1; i <= to; i++){
//            if(tracker * tracker == i){
//                tracker++;
//                System.out.println(i);
//            }
//        }
//    }

    static void allSquares(int to){
        int i = 1;
        while(i * i <= to){
            System.out.println(i * i);
            i++;
        }
    }

    public static void main(String[] args) {
        allSquares(10);
    }

}
