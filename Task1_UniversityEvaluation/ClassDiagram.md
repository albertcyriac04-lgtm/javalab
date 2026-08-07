# Task 1 — Class Diagram (University Evaluation System)

```mermaid
classDiagram
    class StudentEvaluation {
        <<abstract>>
        #String studentName
        #String studentId
        #String courseName
        #int[] subjectMarks
        +StudentEvaluation(name, id, course, marks)
        +displayStudentDetails() void
        +calculateTotalMarks()* int
        +displayGrade()* void
    }

    class UGCourseEvaluation {
        +calculateTotalMarks() int
        +displayGrade() void
    }

    class PGCourseEvaluation {
        -int projectMarks
        +calculateTotalMarks() int
        +displayGrade() void
    }

    class CertificateCourseEvaluation {
        +calculateTotalMarks() int
        +displayGrade() void
    }

    class DiplomaCourseEvaluation {
        +calculateTotalMarks() int
        +displayGrade() void
    }

    StudentEvaluation <|-- UGCourseEvaluation
    StudentEvaluation <|-- PGCourseEvaluation
    StudentEvaluation <|-- CertificateCourseEvaluation
    StudentEvaluation <|-- DiplomaCourseEvaluation

    class UniversityEvaluationDemo {
        +main(String[] args) void
    }
    UniversityEvaluationDemo ..> StudentEvaluation : uses (array of 5 students)
```

**Notes for the hand-drawn diagram in your submission:**
- Draw `StudentEvaluation` at the top in an oval/rectangle labeled *abstract*.
- Draw four boxes below it (`UGCourseEvaluation`, `PGCourseEvaluation`, `CertificateCourseEvaluation`, `DiplomaCourseEvaluation`) connected to it with hollow-triangle arrows (inheritance), pointing **up** to the abstract class.
- `DiplomaCourseEvaluation` should be marked "added later — no change to StudentEvaluation".
