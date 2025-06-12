import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
            int score = input.nextInt();
            input.close(); // Good practice to close the scanner

            char grade;

            // Perfection, Goodluck
            
            if (score >= 90) {
                grade = 'A';
            } else if ( score >= 80) {
                grade = 'B';
            } else if ( score >= 70) {
                grade = 'C';
            } else if ( score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The student grade is: " + grade);

    }
}