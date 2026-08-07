/**
 * Evaluation for Postgraduate (PG) courses.
 * Marking scheme: internal assessment (subjectMarks) is weighted at 60%
 * and a fixed project/viva component (projectMarks) is weighted at 40%,
 * reflecting the heavier research/project component of PG programmes.
 */
public class PGCourseEvaluation extends StudentEvaluation {

    private int projectMarks; // out of 100, extra component specific to PG

    public PGCourseEvaluation(String studentName, String studentId, String courseName, int[] subjectMarks, int projectMarks) {
        super(studentName, studentId, courseName, subjectMarks);
        this.projectMarks = projectMarks;
    }

    @Override
    public int calculateTotalMarks() {
        int internalTotal = 0;
        for (int mark : subjectMarks) {
            internalTotal += mark;
        }
        double internalAvg = (double) internalTotal / subjectMarks.length; // out of 100
        double weighted = (internalAvg * 0.6) + (projectMarks * 0.4);
        return (int) Math.round(weighted);
    }

    @Override
    public void displayGrade() {
        int weightedScore = calculateTotalMarks(); // already a percentage-like score out of 100
        String grade;
        if (weightedScore >= 85) grade = "O (Outstanding)";
        else if (weightedScore >= 70) grade = "A";
        else if (weightedScore >= 55) grade = "B";
        else if (weightedScore >= 40) grade = "C";
        else grade = "F";
        System.out.println("Weighted Score (60% Internal + 40% Project) : " + weightedScore);
        System.out.println("Grade        : " + grade);
    }
}
