import java.util.Scanner;
public class STUDENTGRADE 
{
    public static void main(String args[]) 
    {
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = grade.nextInt();
        int totalMarksofstudent = 0;
        for (int i = 1; i <= subjects; i++) 
        {
            System.out.print("Enter marks for subject " + i + " /100: ");
            int marks = grade.nextInt();
            if (marks < 0 || marks > 100) 
            {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; 
                continue;
            }
            totalMarksofstudent += marks;
        }
        double average = (double) totalMarksofstudent / subjects;
        String studentgrade;
        if (average >= 90) 
        {
            studentgrade = "A+";
        } 
        else if (average >= 80) 
        {
            studentgrade = "A";
        } 
        else if (average >= 70) 
        {
            studentgrade = "B";
        } 
        else if (average >= 60) 
        {
            studentgrade = "C";
        } 
        else if (average >= 50) 
        {
            studentgrade = "D";
        } 
        else 
        {
            studentgrade = "F";
        }
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarksofstudent);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + studentgrade);
        grade.close();
    }
}