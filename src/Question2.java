import java.util.*;

public class Question2
{
    //Question2:In a program,input the side of a square.You have to output the area of the square
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of square :");
        double a = sc.nextDouble();
        double b = a*a;
        System.out.println("The area of square is :" + b);
    }
}
