import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("Student ID: ");
                String id = input.nextLine();

                System.out.print("Student Name: ");
                String name = input.nextLine();

                System.out.print("Marks: ");
                double marks = input.nextDouble();
                input.nextLine();

                students.add(new Student(id, name, marks));

                System.out.println("Student Added!");

            } else if (choice == 2) {

                for (int i = 0; i < students.size(); i++) {
                    students.get(i).displayStudent();
                }

            } else if (choice == 3) {

                System.out.print("Enter Student ID: ");
                String id = input.nextLine();

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).getStudentId().equals(id)) {
                        students.get(i).displayStudent();
                    }
                }

            } else if (choice == 4) {

                double total = 0;

                for (int i = 0; i < students.size(); i++) {
                    total = total + students.get(i).getMarks();
                }

                if (students.size() > 0) {
                    System.out.println("Average Marks = "
                            + (total / students.size()));
                }

            }

        } while (choice != 5);

        System.out.println("Program Ended");
        input.close();
    }
}