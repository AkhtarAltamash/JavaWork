package demo;

//import java.util.Arrays;

import java.util.Arrays;

public class lec21 {
    public static void main(String[] args) {

//        int [] marks=new int[5];
//        marks[0]=20;
//        marks[1]=80;
//        marks[2]=60;
//        marks[3]=70;
//        marks[4]=90;
//        System.out.println(marks[4]);

//        String [] Names=new String[7];
//        Names[0]="Muhammad";
//        Names[1]="Altamash";
//        Names[2]="Akhtar";
//        Names[3]="Ali";
//        Names[4]="Umer";
//        System.out.println(Names[3]);
//        int [] marks={12,24,345,567,324,6,556,8567,7};
//        System.out.println(marks.length);
//        int [] marks={12,23,34,45,56,67,89,99};
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//            for (int i=marks.length-1;i>=0;i--){
//                System.out.println(marks[i]);
//            }
//        String [] name={"Muhammad" ,"Altamash","Akhtar","Taimoor","Sharjeel"};
//        for (int i= name.length-1;i>=0;i--){
//            System.out.println(name[i]);
//        }

//        ---------------------for each loop--------------


//        int [] marks={12,23,34,45,56,67,89,99};
//
//        for (int elements:marks){
//            System.out.println(elements);
//        }

//        int [][] flats=new int[2][3];
//        flats[0][0]= 101;
//        flats[0][1]= 102;
//        flats[0][2]= 103;
//        flats[1][0]= 201;
//        flats[1][1]= 202;
//        flats[1][2]= 203;
//
//        for (int i=0;i<flats.length;i++){
//            for (int j=0;j<flats[i].length;j++)
//                    System.out.print(flats[i][j]);
//                    System.out.print(" ");
//            }
//            System.out.println(" ");


//        -------------------- practise problems-----------------------
//        Q1

//        float [] numbers={10.2f,2.3f,36.6f,55.6f,67.9f,78.5f};
//        float sum=0;
//        for (float element:numbers){
//            sum=sum+element;
//        }
//        System.out.println("the value of sum is "+ sum);
//                          Q2

//        int [] num={12,23,34,45,56,67,68,97};
//        int Find=34;
//        boolean IsInArray=false;
//
//        for (int elements:num){
//            if (Find==elements){
//                IsInArray=true;
//                System.out.println(IsInArray);
//                break;
//
//            }
//        }
//        if (IsInArray){
//            System.out.println("present in array");
//        }
//        else {
//            System.out.println("Not present");
//        }
//               Q3
//

//        int [] marks={89,78,67,79,50};
//        int sum=0;
//        int avg=0;
//        for (int element:marks){
//            sum=sum+element;
//        }
//        avg=sum/marks.length;
//        System.out.println(avg);

//                -----------Q4-------------
        // Practice Problem 4
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }

//        ------------Q5--------

//        int [] arry={1,2,3,4,5,6};
//        int l =arry.length;
//        int n= Math.floorDiv(l,2);
//        int temp;
//        for (int i =0;i<n;i++){
//            temp=arry[i];
//            arry[i]=arry[l-1-i];
//            arry[l-1-i]=temp;
//        }
//        for (int element:arry){
//            System.out.println(element);
//        }

//        -------------Q6---------

        int [] arry={ 12,34,445,75,34,8,99};
        int max =arry[0];
        for (int i=0;i<arry.length;i++){
            if (arry[i]>max){
                max=arry[i];

            }
            System.out.println(max);
        }
        }


        }



