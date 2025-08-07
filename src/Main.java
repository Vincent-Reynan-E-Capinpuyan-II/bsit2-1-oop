public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        int passingCount = 0;

        // Student 1
        s1.displayInfo();
        double avg1 = s1.calculateAverage();
        String letter1 = s1.getLetterGrade();
        boolean isPass1 = s1.isPassing();
        System.out.printf("Average Grade : %.2f\n", avg1);
        System.out.println("Letter Grade  : " + letter1);
        System.out.println("Status        : " + (isPass1 ? "PASSING" : "FAILING"));
        System.out.println();
        if (isPass1) passingCount++;

        // Student 2
        s2.displayInfo();
        double avg2 = s2.calculateAverage();
        String letter2 = s2.getLetterGrade();
        boolean isPass2 = s2.isPassing();
        System.out.printf("Average Grade : %.2f\n", avg2);
        System.out.println("Letter Grade  : " + letter2);
        System.out.println("Status        : " + (isPass2 ? "PASSING" : "FAILING"));
        System.out.println();
        if (isPass2) passingCount++;

        // Student 3
        s3.displayInfo();
        double avg3 = s3.calculateAverage();
        String letter3 = s3.getLetterGrade();
        boolean isPass3 = s3.isPassing();
        System.out.printf("Average Grade : %.2f\n", avg3);
        System.out.println("Letter Grade  : " + letter3);
        System.out.println("Status        : " + (isPass3 ? "PASSING" : "FAILING"));
        System.out.println();
        if (isPass3) passingCount++;

        // Summary
        System.out.println("========");
        System.out.println("Total Students Passing: " + passingCount);
        System.out.println("========");
    }
}