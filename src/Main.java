public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        int passingCount = 0;

        s1.displayInfo();
        double avg1 = s1.calculateAverage();
        System.out.printf("Average Grade : %.2f\n", avg1);
        System.out.println("Letter Grade  : " + s1.getLetterGrade());
        System.out.println("Status        : " + (s1.isPassing() ? "PASSING" : "FAILING"));
        System.out.println();
        if (s1.isPassing()) passingCount++;

        s2.displayInfo();
        double avg2 = s2.calculateAverage();
        System.out.printf("Average Grade : %.2f\n", avg2);
        System.out.println("Letter Grade  : " + s2.getLetterGrade());
        System.out.println("Status        : " + (s2.isPassing() ? "PASSING" : "FAILING"));
        System.out.println();
        if (s2.isPassing()) passingCount++;

        s3.displayInfo();
        double avg3 = s3.calculateAverage();
        System.out.printf("Average Grade : %.2f\n", avg3);
        System.out.println("Letter Grade  : " + s3.getLetterGrade());
        System.out.println("Status        : " + (s3.isPassing() ? "PASSING" : "FAILING"));
        System.out.println();
        if (s3.isPassing()) passingCount++;

        System.out.println("========");
        System.out.println("Total Students Passing: " + passingCount);
        System.out.println("========");
    }
}
