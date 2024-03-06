import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter Total number of subjects:");
        int subjects = sc.nextInt();
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                i--;
            } else {
                totalMarks += marks;
            }
        }

        // Calculate Total Marks
        // Calculate Average Percentage
        double avg = (double) totalMarks / subjects;

        // Grade Calculation
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
