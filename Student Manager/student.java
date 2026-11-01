public class student {
    private String name;
    private int age;
    private double marks;
 
    public student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
 
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }
 
    public String getGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
 
    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks + " | Grade: " + getGrade();
    }
}
 
