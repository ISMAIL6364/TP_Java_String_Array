import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int n = sc.nextInt();


        double[] grades = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade of student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }


        Arrays.sort(grades);


        System.out.println("\nSorted grades:");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }


        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / n;
        System.out.println("\n\nAverage grade: " + average);


        double min = grades[0];
        double max = grades[n - 1];
        System.out.println("Lowest grade: " + min);
        System.out.println("Highest grade: " + max);


        System.out.print("\nEnter a grade to count: ");
        double searchedGrade = sc.nextDouble();
        int count = 0;

        for (double grade : grades) {
            if (grade == searchedGrade) {
                count++;
            }
        }

        System.out.println("Number of students with grade " + searchedGrade + ": " + count);

        sc.close();
    }
}
