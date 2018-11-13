package Projects;

import java.util.Scanner;
import java.util.Random;
public class Assign2Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//creates a scanner to scan input
		Random r = new Random();//creates random to randomize r
		
		int avg = 0;//initial average is 0
		
//step a)
		//arraylists of six within the variable
		String[] students = {"Leon","Luna","Travis","Sarah","Connor","Lizz"};//a string array of six students
		int[] gradeNum = {11,12,10,11,12,10};//an int array of their grade
		//int arrays for the exams to store in students 
		int[] exam1 = new int[students.length];
		int[] exam2 = new int[students.length];
		int[] exam3 = new int[students.length];
		
		//random marks entry for exam 1, 2 and 3 
		for(int i = 0; i < exam1.length; i++) {//random marks entry for exam 1
			exam1[i] = r.nextInt(101);
		}
		for(int i = 0; i < exam2.length; i++) {//random marks entry for exam 2
			exam2[i] = r.nextInt(101);
		}
		for(int i = 0; i < exam3.length; i++) {//random marks entry for exam 3
			exam3[i] = r.nextInt(101);
		}
		
//step b)
		//prints all data for the first student
		System.out.println("Name: " + students[0]);
		System.out.println("Grade: " + gradeNum[0]);
		System.out.println("Exam 1: " + exam1[0]);
		System.out.println("Exam 2: " + exam2[0]);
		System.out.println("Exam 3: " + exam3[0]);
		
		System.out.println();//spacer

//step c)
		//prints all data for the last student
		System.out.println("Name: " + students[5]);
		System.out.println("Grade: " + gradeNum[5]);
		System.out.println("Exam 1: " + exam1[5]);
		System.out.println("Exam 2: " + exam2[5]);
		System.out.println("Exam 3: " + exam3[5]);
		
		System.out.println();//spacer
		
//step d)
		//prints the name of all the students
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();//spacer

//step e)
		//prints all the students and their data all at once
		System.out.println("Name: " + " \t\tGrade: " + " \tExam 1: " + " \tExam 2: " + " \tExam 3: ");
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i] + "\t\t" + gradeNum[i] + "\t\t" + exam1[i] + "\t\t" + exam2[i] + "\t\t" + exam3[i]);
		}
		
		System.out.println();//spacer

//step f)
		//prints all the students and their data all at once, but on a number list this time
		for(int i = 0; i < students.length; i++) {
			System.out.println((i+1) + ". " + students[i] + "\t\t" + gradeNum[i] + "\t\t" + exam1[i] + "\t\t" + exam2[i] + "\t\t" + exam3[i]);
		}
		
		System.out.println();//spacer

		//prints average involving all the exams for each student
		for(int i = 0; i < students.length; i++) {
			avg = (exam1[i] + exam2[i] + exam3[i])/3;//avg is combining all exams, then divided by 3
			System.out.println("The Average of " + students[i] + " is " + avg);//prints avg of each the students
		}
		
		System.out.println();//spacer
//a)	
		System.out.println("Student(s) that scored above 79 on Exam 3:");//informs user which students scored above 73 on exam3
		
		//scans students' score on exam3
		for(int i = 0; i < exam3.length; i++) {
			//prints name of students that scored above 79 on exam3
			if(exam3[i] > 79) {
				System.out.println(students[i]);
				students[i] = "";
			}
		}
//b)
		//scans students' score on exam1
		for(int i = 0; i < exam1.length; i++) {
			//changes the score that is lower than 50 to 40 on exam1 
			if(exam1[i] < 50) {
				exam1[i] = 40;
			}
		}


	}//end main

}//end class
