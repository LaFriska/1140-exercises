package comp1110.homework.J06;

public class DigitSums {

    static int sumDigits(int number) {
        if(number == 0) return 0;
        else return((number % 10) + sumDigits(number / 10));
    }

    static int sumOddDigits(int number) {
        if(number == 0) return 0;
        else {
            int rem = number % 10;
            return(rem % 2 == 1 ? rem + sumOddDigits(number / 10)
                                : sumOddDigits(number / 10));
        }
    }

    static int sumEvenDigits(int number) {
        if(number == 0) return 0;
        else {
            int rem = number % 10;
            return(rem % 2 == 0 ? rem + sumEvenDigits(number / 10)
                                : sumEvenDigits(number / 10));
        }
    }

}
