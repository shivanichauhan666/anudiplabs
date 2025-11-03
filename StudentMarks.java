import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }


        double average = total / 5.0;

        String grade;
        if (average > 90)
            grade = "Ex";
        else if (average > 80)
            grade = "A";
        else if (average > 60)
            grade = "B";
        else if (average >= 40)
            grade = "C";
        else
            grade = "F";

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}