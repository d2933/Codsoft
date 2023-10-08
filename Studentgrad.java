import java.util.Scanner;

public class MarkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        double[] marks = new double[5];
        double totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate average marks
        double averageMarks = totalMarks / 5;

        // Calculate percentage
        double percentage = (totalMarks / (5 * 100)) * 100;

        // Display total marks, average, percentage, and grade
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Determine and display the corresponding grade
        String grade = determineGrade(percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Function to determine the grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}