package demo;

import java.lang.reflect.Method;

public class lec32 {
    static void foo(){
        System.out.println("good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro");

    }
    // (int a,int b)
//     these are parameters
    static void foo(int a,int b){
        System.out.println("Good Morning "+ a + " bro");
        System.out.println("Good Morning "+ b + " bro");


    }
//    static void TellJoke(){
//        System.out.println("My Name Is MUhammad Altamash Akhtar");
//    }


//    static void change(int a){
//
//        a=67;
//    }
//        static void change2(int [] arry){
//            arry[0]=99;
//        }


    public static void main(String[] args) {
//        TellJoke();
//        int x=45;
//        change(x);
//        System.out.println("after change:"+ x);
//        int [] marks ={52,77,87,68,66};
//
//        change2(marks);
//        System.out.println(marks[0]);


//        -----------------------------Method OverLoading-------------------------
// theses all are arguments
        foo();
        foo(2000);
        foo(6000,1000);

    }
}
