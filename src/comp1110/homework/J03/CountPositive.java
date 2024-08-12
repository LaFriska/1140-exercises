package comp1110.homework.J03;

public class CountPositive {

    static int countPositive(int[] numbers){
        int positives = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > 0) positives++;
        return positives;
    }

}
