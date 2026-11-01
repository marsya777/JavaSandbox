import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\n=== Student Manager ===");
            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Search by name");
            System.out.println("4. Show class average");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine(); // clear leftover newline
 
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Age: ");
                    int age = input.nextInt();
                    System.out.print("Marks: ");
                    double marks = input.nextDouble();
                    students.add(new student(name, age, marks));
                    System.out.println("Student added!");
                    break;
 
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students yet.");
                    } else {
                        for (student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
 
                case 3:
                    System.out.print("Enter name to search: ");
                    String search = input.nextLine();
                    boolean found = false;
                    for (student s : students) {
                        if (s.getName().equalsIgnoreCase(search)) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;
 
                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students yet.");
                    } else {
                        double total = 0;
                        for (student s : students) {
                            total += s.getMarks();
                        }
                        System.out.println("Average marks: " + total / students.size());
                    }
                    break;
 
                case 5:
                    System.out.println("Goodbye!");
                    break;
 
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
 
        input.close();
    }
}
