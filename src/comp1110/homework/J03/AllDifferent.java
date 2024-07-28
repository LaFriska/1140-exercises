package comp1110.homework.J03;

public class AllDifferent {

    static boolean allDifferent(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]) return false;
            }
        }
        return true;
    }

}
