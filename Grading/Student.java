public class Student {
    private String name;
    private String matricNo;
    private double marks;

    //Constructor
    public Student (String name, String matricNo, double marks) {
        this.name = name;
        this.matricNo = matricNo;
        this.marks = marks;
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public double getMarks() {
        return marks;
    }

    //Method to calculate grade 
    public String calculateGrade(){
        if (marks >=80){
            return "A";
        } else if (marks >=70){
            return "B";
        } else if (marks >=60){
            return "C";
        } else if (marks >=50){
            return "D";
        } else {
            return "F";
        }
    }

    //Display student information
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Matric No : "+matricNo);
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+calculateGrade());
        System.out.println("-----------------------------");
    }

    

}
