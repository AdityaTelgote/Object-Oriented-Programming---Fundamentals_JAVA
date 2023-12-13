/*Question
 * Implement a function that calculates the average grade for that course 
 */

package ObjectOrientedProgrammingFundamentals;
public class CourseGradesCalculator {
    public static double calculateAverageGrade(double[] grades) {
        if (grades.length == 0) {
            return 0.0; // Return 0 if no grades are provided to avoid division by zero
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {
        // Example: Grades for a course
        double[] courseGrades = {85.5, 90.0, 78.2, 92.8, 88.6};

        // Calculate the average grade for the course
        double averageGrade = calculateAverageGrade(courseGrades);

        // Display the average grade
        System.out.println("Average grade for the course: " + averageGrade);
    }
}
