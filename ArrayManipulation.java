/*Given an integer array, write a Java program that performs the following tasks:

Find the minimum and maximum values in the array.
Compute the average of all the numbers in the array.
Reverse the array.
Print the original array, its minimum, maximum, average, and the reversed array. */
public class ArrayManipulation {

    

    public static void main(String[] args) {
        int[] arr = {3,8,2,5,7};

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }

        int max = arr[0];
        for(int i = 0; i < arr.length; i ++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int start = 0;
        int end = arr.length - 1;         
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }   
            for (int element: arr) {
            System.out.print(element + " ");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum/ arr.length;

        System.out.println("\n"+ "Minimum:" + min);
        System.out.println("Maximum:" + max);
        System.out.println("Average:" + average);
        
        for (int element:arr) {
            System.out.print(element +" ");
        }

    }

}
