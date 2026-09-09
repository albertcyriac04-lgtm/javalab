// Abstract Class
abstract class StudentEvaluation {
    int studentId;
    String studentName;

    // Constructor
    StudentEvaluation(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Concrete Method
    void displayStudentDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }

    // Abstract Methods
    abstract double calculateTotalMarks();
    abstract void displayGrade();
}

// UG Course
class UGCourseEvaluation extends StudentEvaluation {
    int internal;
    int external;

    UGCourseEvaluation(int id, String name, int internal, int external) {
        super(id, name);
        this.internal = internal;
        this.external = external;
    }

    double calculateTotalMarks() {
        return internal + external;
    }

    void displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 90)
            System.out.println("Grade : A+");
        else if (total >= 75)
            System.out.println("Grade : A");
        else if (total >= 60)
            System.out.println("Grade : B");
        else
            System.out.println("Grade : C");
    }
}

// PG Course
class PGCourseEvaluation extends StudentEvaluation {
    int assignment;
    int project;
    int exam;

    PGCourseEvaluation(int id, String name, int assignment, int project, int exam) {
        super(id, name);
        this.assignment = assignment;
        this.project = project;
        this.exam = exam;
    }

    double calculateTotalMarks() {
        return assignment + project + exam;
    }

    void displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 95)
            System.out.println("Grade : O");
        else if (total >= 85)
            System.out.println("Grade : A+");
        else if (total >= 70)
            System.out.println("Grade : A");
        else
            System.out.println("Grade : B");
    }
}

// Certificate Course
class CertificateCourseEvaluation extends StudentEvaluation {
    int theory;
    int practical;

    CertificateCourseEvaluation(int id, String name, int theory, int practical) {
        super(id, name);
        this.theory = theory;
        this.practical = practical;
    }

    double calculateTotalMarks() {
        return theory + practical;
    }

    void displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 90)
            System.out.println("Grade : Excellent");
        else if (total >= 70)
            System.out.println("Grade : Very Good");
        else if (total >= 50)
            System.out.println("Grade : Good");
        else
            System.out.println("Grade : Average");
    }
}

// Diploma Course
class DiplomaCourseEvaluation extends StudentEvaluation {
    int test;
    int viva;
    int practical;

    DiplomaCourseEvaluation(int id, String name, int test, int viva, int practical) {
        super(id, name);
        this.test = test;
        this.viva = viva;
        this.practical = practical;
    }

    double calculateTotalMarks() {
        return test + viva + practical;
    }

    void displayGrade() {
        double total = calculateTotalMarks();
        if (total >= 90)
            System.out.println("Grade : Distinction");
        else if (total >= 75)
            System.out.println("Grade : First Class");
        else if (total >= 60)
            System.out.println("Grade : Second Class");
        else
            System.out.println("Grade : Pass");
    }
}

// Main Class
public class UniversityEvaluationSystem {
    public static void main(String[] args) {
        StudentEvaluation[] students = {
                new UGCourseEvaluation(101, "Albert", 25, 60),
                new UGCourseEvaluation(102, "Arjun", 30, 65),
                new PGCourseEvaluation(201, "Alvin", 20, 25, 50),
                new CertificateCourseEvaluation(301, "Arjun", 40, 45),
                new DiplomaCourseEvaluation(401, "Neha", 30, 28, 35)
        };

        for (StudentEvaluation s : students) {
            System.out.println("--------------------------------");
            s.displayStudentDetails();
            System.out.println("Total Marks : " + s.calculateTotalMarks());
            s.displayGrade();
        }
    }
}