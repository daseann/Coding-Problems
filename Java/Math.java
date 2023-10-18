package Java;
import java.util.*;

public class Math {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = in.nextInt();
    System.out.println("Enter the second number:");
    int num2 = in.nextInt();
    int sum = num1 + num2;
    System.out.println("The sum of "+num1+" and "+num2+" is "+sum+".\n");
    int sub = num1 - num2;
    System.out.println("Subtracting "+num2+" from "+num1+" gives "+sub+".\n");
    int product = num1 * num2;
    System.out.println("Multiplying "+num1+" by "+num2+" gives "+product+".\n");
    if (num2 == 0) {
        System.out.println("Dividing "+num1+" by "+num2+" results in a division by zero error.\n");
    } else {
        int div = num1/num2;
        System.out.println("Dividing "+num1+" by "+num2+" gives "+div+".\n");
    }

}
}