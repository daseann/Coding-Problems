// Looping: Write a Java program that prints the first 10 numbers in the Fibonacci sequence.

class Fibonacci {

    static void fib(int n) {
        int prev1 = 0, prev2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(" " + prev1);

            int nextNum= prev1+prev2;
            prev1 = prev2;
            prev2 = nextNum;
            counter += 1;

        }

    }

    public static void main(String[] args) {
        int n = 10;
        fib(n);
    }
}

