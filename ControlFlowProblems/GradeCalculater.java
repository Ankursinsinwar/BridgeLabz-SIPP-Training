package ControlFlowProblems;

import java.util.Scanner;
public class GradeCalculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Physics: ");
        Double physics = sc.nextDouble();

        System.out.print("Enter marks of chemistry: ");
        Double chemistry = sc.nextDouble();
        
        System.out.print("Enter marks of maths: ");
        Double maths = sc.nextDouble();

        double marks = (physics + chemistry + maths) / 3;
        char grade ;

        if (marks >= 80) {
            grade = 'A';
            System.out.println("Marks: " + marks + " Grade: " + grade + " Remark: Level 4, above agency-normalized standards");
        }else if(marks >= 70 && marks <= 79){
            grade = 'B';
            System.out.println("Marks: " + marks + " Grade: " + grade + " Remark: Level 3, at agency-normalized standards");
        }else if(marks >= 60 && marks <= 69){
            grade = 'C';
            System.out.println("Marks: " + marks + " Grade: " + grade + " Remark: Level 2, below, but approaching agency-normalized standards");
        }else if(marks >= 50 && marks <= 59){
            grade = 'D';
            System.out.println("Marks: " + marks + " Grade: " + grade + " Remark: Level 1, well below agency-normalized standards");
        }else if(marks >= 40 && marks <= 49){
            grade = 'E';
            System.out.println("Marks: " + marks + " Grade: " + grade + " Remark: Level 1-, too below agency-normalized standards");
        }else {
            grade = 'R';
            System.out.println("Remedial standards");
        }
        sc.close();
    }
}
