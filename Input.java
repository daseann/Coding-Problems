//Write a Java program that takes a string input and returns the most frequently 
//occurring character in that string. If there are multiple characters with the same
//highest frequency, return the one that appears first in the string.
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter multiple characters: ");
        String str = in.nextLine();
        
        int[] frequency = new int[256];
        
        // Populate frequency array
        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        
        int maxFrequency = 0;
        char mostFrequentChar = '\0';
        
        // Iterate through the string to find the most frequent character
        for (char c : str.toCharArray()) {
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequentChar = c;
            }
        }
        
        System.out.println("Most frequent character: " + mostFrequentChar + " with frequency: " + maxFrequency);
    }
}
