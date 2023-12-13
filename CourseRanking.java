/*Question
 * Implement a function that outputs a ranking with all students enrolled in a course and respective grades. 
 */
package ObjectOrientedProgrammingFundamentals;

import java.util.*;

public class CourseRanking {
    public static void displayCourseRanking(Map<String, Double> studentGrades) {
        if (studentGrades.isEmpty()) {
            System.out.println("No students enrolled in the course.");
            return;
        }

        System.out.println("Course Ranking:");
        int rank = 1;
        // Create a sorted list of entries (student name and grade)
        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(studentGrades.entrySet());
        // Sort the entries based on grades in descending order
        Collections.sort(sortedEntries, (entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // Display the ranking
        for (Map.Entry<String, Double> entry : sortedEntries) {
            System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue());
            rank++;
        }
    }

    public static void main(String[] args) {
        // Example: Map containing students and their grades for a course
        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Aditya", 85.5);
        studentGrades.put("Aniket", 90.0);
        studentGrades.put("Senket", 78.2);
        studentGrades.put("Diksha", 92.8);
        studentGrades.put("Neha", 88.6);

        // Display the course ranking
        displayCourseRanking(studentGrades);
    }
}
