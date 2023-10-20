import java.util.Scanner;

public class PrimeNumber {

    public boolean prime(int n) {
        if (n <= 1) return false; // this says numbers 1 and below can't be prime
        for (int i = 2; i < Math.sqrt(n); i++) { //this will iterate from i=2 up to the square root of n
            // if n has a divisor greater than its square root, then it must also have a divisor smaller than its
            //square root.
            if (n % i == 0) return false; 
            //the loop checks if n is divisible by i using the modulo operator
            // if n %i is 0, it means n is divisble by i
            //and therefor n is not a prime number, so it returns false
            }
            return true; //returns true to indicate it is a prime numbers
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        PrimeNumber pn = new PrimeNumber();
        System.out.println("Prime numbers up to: " + num + ": ");
        for (int i = 2; i <= num; i++) {
            if (pn.prime(i)) {
                System.out.print(i + ", ");
        }
        in.close();

    }
}
}

