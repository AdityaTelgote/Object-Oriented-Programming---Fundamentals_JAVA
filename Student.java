package ObjectOrientedProgrammingFundamentals;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String courseName;
    private String professorName;
    private static int year;
    private List<Student> enrolledStudents;

    public Student(String courseName, String professorName, int year, int i, int j) {
        this.setCourseName(courseName);
        this.setProfessorName(professorName);
        this.setYear(year);
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.removeIf(s -> s.equals(student));
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int bestGrade = 0;
        for (Student student : enrolledStudents) {
            if (student.isApproved() && student.bestGrade() > bestGrade) {
                bestGrade = student.bestGrade();
            }
        }
        return bestGrade;
    }

    boolean isApproved() {
		// TODO Auto-generated method stub
		return false;
	}

	public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }

    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("John", "Doe", 1001, year, year);
        Student student2 = new Student("Alice", "Smith", 1002, year, year);
        Student student3 = new Student("Bob", "Johnson", 1003, year, year);

        // Creating a course
        Student mathCourse = new Student("Mathematics", "Professor X", 2023, year, year);

        // Enrolling students
        mathCourse.enroll(student1);
        mathCourse.enroll(student2);
        mathCourse.enroll(student3);

        // Unenrolling a student
        mathCourse.unEnroll(student2);

        // Counting students in the course
        int studentCount = mathCourse.countStudents();
        System.out.println("Number of students in the course: " + studentCount);

        // Getting the best grade in the course
        int bestGrade = mathCourse.bestGrade();
        System.out.println("Best grade in the course: " + bestGrade);

        // Enrolling multiple students at once
        Student[] moreStudents = {new Student("Eva", "Williams", 1004, bestGrade, bestGrade), new Student("Michael", "Brown", 1005, bestGrade, bestGrade)};
        mathCourse.enroll(moreStudents);

        // Checking the new student count
        studentCount = mathCourse.countStudents();
        System.out.println("Updated number of students in the course: " + studentCount);
    }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
