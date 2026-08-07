/**
 * Evaluation for Undergraduate (UG) courses.
 * Marking scheme: simple sum of all subject marks.
 * Grade boundaries are the standard UG boundaries.
 */
public class UGCourseEvaluation extends StudentEvaluation {

    public UGCourseEvaluation(String studentName, String studentId, String courseName, int[] subjectMarks) {
        super(studentName, studentId, courseName, subjectMarks);
    }

    @Override
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        double percentage = (double) total / (subjectMarks.length * 100) * 100;
        String grade;
        if (percentage >= 80) grade = "A+";
        else if (percentage >= 70) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "F";
        System.out.println("Total Marks  : " + total);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Grade        : " + grade);
    }
}
