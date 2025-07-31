import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Section: ");

        String section = scanner.nextLine();
        System.out.print("\nEnter Midterm Exam Score: ");

        int midtermScore = scanner.nextInt();
        System.out.print("Enter Final Exam Score: ");

        int finalScore = scanner.nextInt();
        System.out.print("Enter Project Score: ");

        int projectScore = scanner.nextInt();
        System.out.print("Enter Attendance Percentage: ");

        int attendanceScore = scanner.nextInt();
        scanner.nextLine();

        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = (totalScore / 400.0) * 100;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);

        System.out.println("Average Score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
