package com.codsoft;
import java.util.Scanner;

public class grade_of_student {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        grade();
    }

    static void grade(){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the total number of subjects :");
        int Total_subjects = in.nextInt();
        int sum =0;

        for (int i = 1; i <=Total_subjects ; i++) {
            System.out.print("enter the each subject marks out of 100 :");
            int subject_marks = in.nextInt();
            sum += subject_marks;

            System.out.println("Total marks for subject " + i + ": " + sum);

        }

        double average = (double) sum/Total_subjects;
        System.out.println(average);

        if(average >=91 && average<=100){
            System.out.println("Grade AA");
        }if(average >=81 && average<=90){
            System.out.println("Grade AB");
        }if(average >=71 && average<=80){
            System.out.println("Grade BB");
        }if(average >=61 && average<=70){
            System.out.println("Grade CC");
        }if(average >=51 && average<=60){
            System.out.println("Grade CD");
        }if(average >=45 && average<=50){
            System.out.println("Grade DD");
        }if(average< 45){
            System.out.println("Fail");
        }
    }
}
