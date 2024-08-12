package comp1110.homework.J06;

public class DigitSums {

    static int sumDigits(int number) {
        if(number == 0) return 0;
        return (number % 10) + sumDigits(number / 10);
    }

    static int sumOddDigits(int number) {
        if(number == 0) return 0;
        int remainder = (number % 10);
        return (remainder % 2 == 1 ? remainder : 0)  + sumOddDigits(number / 10);
    }

    static int sumEvenDigits(int number) {
        if(number == 0) return 0;
        int remainder = (number % 10);
        return (remainder % 2 == 0 ? remainder : 0)  + sumEvenDigits(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumEvenDigits(44454));
    }

}
