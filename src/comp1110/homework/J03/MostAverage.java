package comp1110.homework.J03;

public class MostAverage {

    static int mostAverage(int[] numbers){
        float avg = getAverage(numbers);
        float leastDiff = Float.MAX_VALUE;
        int res = 0;
        float diff;
        for(int i = 0; i < numbers.length; i++){
            diff = Math.abs(numbers[i] - avg);
            if(diff < leastDiff){
                leastDiff = diff;
                res = numbers[i];
            }
        }
        return res;
    }

    static float getAverage(int[] numbers){
        float sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        return sum / numbers.length;
    }

}
