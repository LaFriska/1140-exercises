package comp1110.homework.J06;

public class Primes {
    static void allPrimes(int to){
        for(int i = 2; i <= to; i++){
            if(verifyPrime(i)) System.out.println(i);
        }
    }

    static boolean verifyPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(verifyPrime(12));
    }

}
