/**
 * NEW course type added later to demonstrate that StudentEvaluation
 * did NOT need to be modified to support it (Open/Closed Principle).
 * Marking scheme: average of subject marks, with a 5% bonus added
 * for practical-heavy diploma courses.
 */
public class DiplomaCourseEvaluation extends StudentEvaluation {

    public DiplomaCourseEvaluation(String studentName, String studentId, String courseName, int[] subjectMarks) {
        super(studentName, studentId, courseName, subjectMarks);
    }

    @Override
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        double average = (double) total / subjectMarks.length;
        double withBonus = average * 1.05; // 5% practical bonus
        return (int) Math.min(100, Math.round(withBonus));
    }

    @Override
    public void displayGrade() {
        int score = calculateTotalMarks();
        String grade = (score >= 50) ? "PASS with Distinction Track" : "PASS" ;
        if (score < 40) grade = "FAIL";
        System.out.println("Final Score (avg + 5% practical bonus) : " + score);
        System.out.println("Grade        : " + grade);
    }
}
