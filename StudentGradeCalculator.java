import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;
        String grade;

        if (average >= 90) grade = "Distinction";
        else if (average >= 80) grade = "First Class";
        else if (average >= 70) grade = "Second Class";
        else if (average >= 60) grade = "Pass";
        else grade = "Fail";

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);
    }
}
