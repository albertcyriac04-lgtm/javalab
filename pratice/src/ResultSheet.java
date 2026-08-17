public class ResultSheet {
    public static void main(String[] args) {

        int[] marks = {80, 65, 90, 75, 85, 70};

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;

        for (int mark : marks) {

            if (mark > highest)
                highest = mark;

            if (mark < lowest)
                lowest = mark;

            sum += mark;
        }

        double average = (double) sum / marks.length;

        int aboveAverage = 0;

        for (int mark : marks) {
            if (mark > average)
                aboveAverage++;
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Above Average = " + aboveAverage);

        // Deliberate error:
        // System.out.println(marks[6]);
    }
}