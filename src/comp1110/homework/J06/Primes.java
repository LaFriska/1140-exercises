package comp1110.homework.J06;

public class Primes {

    static void allPrimes(int to){
        if(to < 2) return;
        else{
            for(int i = 2; i <= to; i++){
                if(isPrime(i)) System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        int root = (int) Math.ceil(Math.sqrt(n));
        if(n == 2) return true;
        for(int i = 2; i <= root; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        allPrimes(10);
    }

}
