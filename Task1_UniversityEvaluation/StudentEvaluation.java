/**
 * Abstract class representing a generic student evaluation.
 * Holds data and behaviour common to every course type offered
 * by the university. Each concrete course type must supply its
 * own marking scheme and grading logic by implementing the
 * abstract methods below.
 */
public abstract class StudentEvaluation {

    // ---- Common data shared by every course type ----
    protected String studentName;
    protected String studentId;
    protected String courseName;
    protected int[] subjectMarks; // raw marks scored in each subject

    /**
     * Constructor: initializes the fields common to all evaluations.
     */
    public StudentEvaluation(String studentName, String studentId, String courseName, int[] subjectMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseName = courseName;
        this.subjectMarks = subjectMarks;
    }

    /**
     * Concrete method: identical for every subclass, so it lives here
     * instead of being duplicated in each course type.
     */
    public void displayStudentDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Course       : " + courseName);
    }

    // ---- Abstract methods: every course type must define its own rules ----

    /** Each course type has a different marking / weighting scheme. */
    public abstract int calculateTotalMarks();

    /** Each course type has a different grading policy. */
    public abstract void displayGrade();
}
