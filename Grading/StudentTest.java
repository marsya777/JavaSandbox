public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Marsya", "S1234", 85);
        Student student2 = new Student("Amin", "S5678", 63);
        Student student3 = new Student("Rahul", "S1580", 32);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }

    static class Student {
        private String name;
        private String studentId;
        private int marks;

        public Student(String name, String studentId, int marks) {
            this.name = name;
            this.studentId = studentId;
            this.marks = marks;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentId);
            System.out.println("Marks: " + marks);
        }
    }
}
