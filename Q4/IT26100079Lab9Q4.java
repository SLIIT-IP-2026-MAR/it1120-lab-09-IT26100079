import java.util.Scanner;

public class IT26100079Lab9Q4 {

    //  calculate final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    //  determine the grade
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c)  print the student details
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-15.2f%s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store details for 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // Loop to read details for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            
            System.out.println(); 
        }

        // Display summary table header
        System.out.printf("%-15s%-15s%s\n", "Name", "Final Mark", "Grade");

        // Loop to print details
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    } // Closes main method
} // Closes class