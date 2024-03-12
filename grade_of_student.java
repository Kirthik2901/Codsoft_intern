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
            double subject_marks = in.nextInt();
            sum += subject_marks;

            System.out.println(sum);

        }
        if(sum >451 && sum <= 500){
            System.out.println("Grade AA");
        }if(sum >401 && sum <= 450){
            System.out.println("Grade AB");
        }if(sum > 351 && sum <= 400){
            System.out.println("Grade BB");
        }if(sum >301 && sum <= 350){
            System.out.println("Grade CC");
        }if(sum >251 && sum <= 300){
            System.out.println("Grade CD");
        }if(sum >201 && sum <= 250){
            System.out.println("Grade DD");
        }if(sum < 200){
            System.out.println("Fail");
        }
    }
}
