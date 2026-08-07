/**
 * Driver class for the University Evaluation System.
 * Stores different course-type student objects in a single
 * StudentEvaluation array (polymorphism) and loops through them.
 */
public class UniversityEvaluationDemo {

    public static void main(String[] args) {

        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation(
                "Albert Cyriac", "UG101", "BSc Mathematics",
                new int[]{85, 78, 92, 88, 74});

        students[1] = new UGCourseEvaluation(
                "Anjali Menon", "UG102", "BSc Computer Science",
                new int[]{45, 38, 55, 42, 30});

        students[2] = new PGCourseEvaluation(
                "Rahul Nair", "PG201", "MCA - AI/ML",
                new int[]{88, 91, 85, 79}, 92);

        students[3] = new PGCourseEvaluation(
                "Sneha Thomas", "PG202", "MSc Data Science",
                new int[]{60, 55, 58, 62}, 50);

        students[4] = new CertificateCourseEvaluation(
                "Vishnu Prasad", "CT301", "Certificate in Cloud Computing",
                new int[]{72});

        // Loop through the array — same code works for every course type
        for (int i = 0; i < students.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Record " + (i + 1));
            System.out.println("-------------------------------------------");
            students[i].displayStudentDetails();
            students[i].displayGrade(); // internally calls calculateTotalMarks()
        }

        // ---- Demonstrating extensibility ----
        // DiplomaCourseEvaluation was added AFTER this program was written,
        // and StudentEvaluation.java was never touched to support it.
        System.out.println("-------------------------------------------");
        System.out.println("New course type added without modifying abstract class:");
        System.out.println("-------------------------------------------");
        StudentEvaluation newType = new DiplomaCourseEvaluation(
                "Fathima Zahra", "DP401", "Diploma in Web Development",
                new int[]{65, 70, 68});
        newType.displayStudentDetails();
        newType.displayGrade();
    }
}
