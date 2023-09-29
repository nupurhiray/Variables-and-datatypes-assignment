import java.util.*;

public class Question1
{
    //Question1:In a program,input3numbers:A,BandC.You have to output the average of these 3 numbers
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("The numbers are : "+ a +" , "+ b +" , "+ c );
        double d = (a+b+c)/3;
        System.out.println("The average is : "+d);
    }
}
