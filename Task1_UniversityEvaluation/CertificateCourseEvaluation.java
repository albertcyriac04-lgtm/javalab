/**
 * Evaluation for short Certificate courses.
 * Marking scheme: Pass/Fail only, based on a single qualifying exam mark
 * (the first entry of subjectMarks). No letter grading — certificate
 * courses simply record completion status.
 */
public class CertificateCourseEvaluation extends StudentEvaluation {

    private static final int PASS_MARK = 40;

    public CertificateCourseEvaluation(String studentName, String studentId, String courseName, int[] subjectMarks) {
        super(studentName, studentId, courseName, subjectMarks);
    }

    @Override
    public int calculateTotalMarks() {
        // Certificate courses use a single qualifying exam mark.
        return subjectMarks[0];
    }

    @Override
    public void displayGrade() {
        int mark = calculateTotalMarks();
        String status = (mark >= PASS_MARK) ? "PASS" : "FAIL";
        System.out.println("Qualifying Exam Mark : " + mark);
        System.out.println("Result       : " + status);
    }
}
