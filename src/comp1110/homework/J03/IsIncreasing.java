package comp1110.homework.J03;

public class IsIncreasing {

    static boolean isIncreasing(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i+1] < numbers[i]) return false;
        }
        return true;
    }

}
