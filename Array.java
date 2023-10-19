// Create an array of 10 integers in Java, and implement 
// a method that finds and returns the average of these numbers.
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            sum += arr[i];

        }
        int average = sum / arr.length;

        System.out.println(average);
    }

}
