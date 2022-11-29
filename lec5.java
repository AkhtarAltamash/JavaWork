package demo;
import java.util.Scanner;

public class lec5 {
    public static void main(String[] args) {
        System.out.println("Hello jee");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number 1 for addition");
        int a= sc.nextInt();
        System.out.print("Enter any number 2 for addition");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of these number is"+sum);

        String str=sc.nextLine();

    }
}
