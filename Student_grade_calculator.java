import java.util.Scanner;
import java.io.*;


public class Student_grade_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the English mark: ");
        int English = sc.nextInt();
        System.out.print("Enter the Maths mark: ");
        int Maths = sc.nextInt();
        System.out.print("Enter the Tamil mark: ");
        int Tamil = sc.nextInt();
        System.out.print("Enter the Science mark: ");
        int Science = sc.nextInt();
        System.out.print("Enter the Social Science mark: ");
        int Social_Science = sc.nextInt();

        int Total_Marks = English + Maths + Tamil + Science + Social_Science ; 
        int Average_percentage = (Total_Marks / 5 ); 

        System.out.println("Your Total marks : " + Total_Marks+"/500");
        System.out.println("Your Average percentage : "+ Average_percentage+"%");

        if(Average_percentage >= 90){
            System.out.println("Grade (Based on Average percentage) : O");
        }
        else if(Average_percentage >=80){
            System.out.println("Grade : A");
        }
        else if(Average_percentage >=70){
            System.out.println("Grade : B");
        }
        else if(Average_percentage>= 60){
            System.out.println("Grade : C");
        }
        else if(Average_percentage >= 50){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : E");
        }
        }
    }
