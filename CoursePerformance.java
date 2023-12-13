/*Question
 * Implement a function that, for each student, show if he/she is above course average or not.
 */
package ObjectOrientedProgrammingFundamentals;

import java.util.*;

public class CoursePerformance {
    public static void displayStudentPerformance(Map<String, Double> studentGrades) {
        if (studentGrades.isEmpty()) {
            System.out.println("No students enrolled in the course.");
            return;
        }

        // Calculate the average grade for the course
        double courseAverage = calculateAverageGrade(studentGrades);

        System.out.println("Student Performance (Above/Below Course Average):");
        // Display if each student's grade is above or below the course average
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            double studentGrade = entry.getValue();
            if (studentGrade > courseAverage) {
                System.out.println(studentName + ": Above average");
            } else if (studentGrade < courseAverage) {
                System.out.println(studentName + ": Below average");
            } else {
                System.out.println(studentName + ": Equal to average");
            }
        }
    }

    public static double calculateAverageGrade(Map<String, Double> studentGrades) {
        double total = 0.0;
        for (double grade : studentGrades.values()) {
            total += grade;
        }
        return total / studentGrades.size();
    }

    public static void main(String[] args) {
        // Example: Map containing students and their grades for a course
        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Aditya", 89.5);
        studentGrades.put("Aniket", 95.0);
        studentGrades.put("Senket", 75.2);
        studentGrades.put("Diksha", 81.8);
        studentGrades.put("Neha", 78.6);

        // Display each student's performance compared to the course average
        displayStudentPerformance(studentGrades);
    }
}

