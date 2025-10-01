import java.util.Arrays;

/**
 * Student class with inner GradeBook class
 * Demonstrates how inner classes can access outer class private fields
 */
public class Student {
    private String name;
    private int studentID;
    private double GPA;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        GPA = 0;

    }

    public void displayInfo() {
        System.out.println("Name: " + name + "ID: " + studentID + "GPA: " + GPA);

    }

    public GradeBook createGradeBook() {
        return new GradeBook();

    }

    /**
     * Inner GradeBook class - can access all outer Student class members
     * This demonstrates the power of inner classes for tight coupling
     */
    class GradeBook {
        private double[] grades;
        private int gradeCount;

        public GradeBook() {
            grades = new double[5];
            gradeCount = 0;

        }

        // TODO: Create addGrade(double grade) method
        // TODO: Check if gradeCount is less than 5 (array not full)
        // TODO: If not full: add grade to grades[gradeCount], increment gradeCount, print "Grade added successfully"
        // TODO: If full: print "GradeBook is full! Cannot add more grades."
        public void addGrade(double grade) {
            // TODO: Implement addGrade method
            if (gradeCount < 5){
                grades[gradeCount] = grade;
                gradeCount++;
                System.out.println("Grade Added: ");
            }else {
                System.out.println("Gradebook is full.!");
            }

        }

        // TODO: Create calculateGPA() method
        // TODO: Calculate the average of all grades that have been added
        // TODO: Update the outer Student class GPA field (this shows inner class access!)
        // TODO: Print "GPA calculated and updated to: " + the new GPA value
        // TODO: Handle case where no grades have been added (gradeCount == 0)
        public void calculateGPA() {
            double sum = 0.0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            GPA = sum / grades.length;
            // TODO: Implement calculateGPA method
            // TODO: Remember: you can directly access and modify the outer class GPA field!
            // TODO: Use: Student.this.GPA = calculatedAverage;

        }

        // TODO: Create displayGrades() method
        // TODO: Print "Grades for student: " + the student's name (access outer class private field!)
        // TODO: Print all grades that have been added so far
        // TODO: Print "Current GPA: " + the current GPA
        // TODO: Handle case where no grades have been added
        public void displayGrades() {
            // TODO: Implement displayGrades method
            // TODO: Remember: you can access outer class private fields directly!
            // TODO: Use: Student.this.name to access the outer class name field
            System.out.println();
            System.out.println(Arrays.toString(grades));
            System.out.println("Current GPA: " + GPA);

        }
    }
}