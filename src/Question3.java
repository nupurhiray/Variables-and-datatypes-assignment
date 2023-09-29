import java.util.*;

public class Question3
{
    /*
    * Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser.
    * You have to output the total cost of the items back to the user as their bill.
    * Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the pencil : ");
        float a = sc.nextFloat();
        System.out.println("Enter the price of the pen : ");
        float b = sc.nextFloat();
        System.out.println("Enter the price of the eraser : ");
        float c = sc.nextFloat();
        float d = a+b+c;

        System.out.println("The total bill is : "+d);

        float gst = (float) ((d)+(d*0.18));
        System.out.println("The total bill is with gst is: "+ gst);
    }
}
