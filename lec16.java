package demo;
import java.util.Scanner;
import java.util.Random;
public class lec16 {
    public static void main(String[] args) {
//        System.out.println("hello jee");


        // decision layna ha to hum conditional ka use karta ha if else
//        System.out.println("ENTER ANY NUMBER");
//        Scanner sc=new Scanner(System.in);
//        int age= sc.nextInt();
////        int age= 6;
//        if(age!=18) {
//            System.out.println("You can drive");
//        }
//        else{
//                System.out.println("you can't");
//            }
//
//        boolean a= true;
//        boolean b= false;

//        if (a && b){
//            System.out.println("Y");
//        }
//        else {
//            System.out.println("N");
//        }

//        System.out.println("For Logical AND...");
//        boolean a = true;
//        boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

//        System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

//        boolean a= true;
//        boolean b= false;
//
//        System.out.println("For Logical NOT");
//        System.out.print("Not(a) is ");
//        System.out.println(!a);
//        System.out.print("Not(b) is ");
//        System.out.println(!b);



//        --------------lec 18--------------------------

//        int age ;
//        Scanner sc=new Scanner(System.in);
//        age = sc.nextInt();
//
//        if (age>56){
//            System.out.println("You Are Experienced");
//        }
//        else if (age>46){
//            System.out.println("You Are Semi Experienced");
//        }
//        else if (age>36){
//            System.out.println("You are Semi SEmi Experienced ");
//        }
//        else System.out.println("You are not experienced");

        //  switch use karta ha choices ka lia !

//
//        Scanner Sc =new Scanner(System.in);
//        int  age = Sc.nextInt();
//
//        switch (age) {
//            case 18 -> System.out.println("You are teen");
//            case 20 -> System.out.println("You are Adult ");
//            case 25 -> System.out.println("You are Master");
//            case 30 -> System.out.println("You are older");
//            case 40 -> System.out.println("You are good");
//            default -> System.out.println("Enjoy your life");
//        }
//
//        System.out.println("Thnaks for the code");
//-------------------------------Lec 19----------------
//  QUESTION# 02
//        byte m1,m2,m3;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter The Marks of Maths");
//        m1 = sc.nextByte();
//        System.out.println("Enter The Marks Of Physics");
//        m2 =sc.nextByte();
//        System.out.println("Enter The Marks Of Computer");
//        m3=sc.nextByte();
//        float avg =(m1+m2+m3)/3.0f;
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congrats you have been promoted");
//
//        }
//        else {
//            System.out.println("YOU FAILED");
//        }

//        QUESTION# 03
//        Question 1:
//        int a = 11;
//        if(a=11){
//
//        }

        // Question 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

//        Question 4:

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Question 6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
//        Random r = new Random();
//        int a = r.nextInt();
//        System.out.println(a);

//        CHALLENGE ROCK PAPER AND SCICERROR


        System.out.println("0-> Rock");
        System.out.println("1-> Paper");
        System.out.println("2-> Scissor");
        System.out.println("Select from choices");
        Scanner sc =new Scanner(System.in);
        int uc = sc.nextInt();
        System.out.println("you Chose "+uc);

        Random r = new Random();
        int cc = r.nextInt(2);
        System.out.println("Computer choise is "+ cc);


        if (uc==cc){
            System.out.println("It's a Draw");
        }
        //Rock Paper
        else if (uc==0 && cc==1){
            System.out.println("Computer Won");
        }
        else if (uc==1 && cc==0){
            System.out.println("User Won");
        }
        //Rock Scissor
        else if (uc==0 && cc==2){
            System.out.println("User Won");
        }
        else if (uc==2 && cc==0){
            System.out.println("Computer Won");
        }
        // Paper Scissor
        else if (uc==1 && cc==2){
            System.out.println("user Won");
        }else if (uc==2 && cc==1){
            System.out.println("Computer Won");
        }

//        ---------------Lec 20---------------




    }
}
