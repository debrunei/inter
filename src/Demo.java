public class Demo {
    public static void main(String[] args) {

//        Car.Engine myCarEngine = new Car.Engine("BigBeefie", 12345.0);
//        Car myCar = new Car("Chevy", "Camaro", myCarEngine);
//        System.out.println(myCar);

        System.out.println("=" + "=".repeat(50));
        System.out.println("STUDENT GRADEBOOK SYSTEM");
        System.out.println("=" + "=".repeat(50));
        System.out.println("This program demonstrates inner classes in Java!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Get student information from user
        System.out.println("CREATING NEW STUDENT");
        System.out.println("-".repeat(25));
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create a Student object using the name and ID from user input
        Student student = new Student(name, studentID);

        // Display the initial student information
        System.out.println("\nINITIAL STUDENT INFORMATION:");
        System.out.println("-".repeat(30));
        student.displayInfo();

        // Create a GradeBook for the student using the createGradeBook() method
        Student.GradeBook gradeBook = student.createGradeBook();

        System.out.println("\nADDING GRADES TO GRADEBOOK");
        System.out.println("-".repeat(30));

        // Ask user how many grades they want to add (1-5)
        System.out.print("How many grades would you like to add (1-5)? ");
        int numGrades = scanner.nextInt();

        // Ensure valid number of grades
        if (numGrades > 5) {
            numGrades = 5;
            System.out.println("Maximum 5 grades allowed. Setting to 5.");
        }

        // Use a for loop to add the specified number of grades
        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            gradeBook.addGrade(grade);
        }

        System.out.println("\nCALCULATING GPA");
        System.out.println("-".repeat(20));
        gradeBook.calculateGPA();

        System.out.println("\nFINAL RESULTS");
        System.out.println("-".repeat(15));
        student.displayInfo();

        System.out.println();
        gradeBook.displayGrades();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("INNER CLASS DEMONSTRATION COMPLETE!");
        System.out.println("Notice how the GradeBook inner class could:");
        System.out.println("• Access the Student's private 'name' field");
        System.out.println("• Modify the Student's private 'GPA' field");
        System.out.println("• This is the power of inner classes in Java!");
        System.out.println("=" + "=".repeat(50));

        scanner.close();

    }
}