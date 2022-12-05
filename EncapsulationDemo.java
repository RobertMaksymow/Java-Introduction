class StudentData {
    private int studentNumber;
    private String studentName;

    // Getters and Setters - correct way to assign variables (indirect-through
    // methods). That way we are binding our data with the methods (we are
    // encapsulating data).
    // Right-Click > Source Action > Generate Setters and Getters
    public void setStudentNumber(int num) {
        studentNumber = num;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        // s1.studentNumber = 2; // incorrect way to assign the value
        // s1.studentName = "Navin"; // incorrect way to assign the value

        s1.setStudentNumber(5); // correct way
        s1.setStudentName("Navin");
        System.out.println(s1.getStudentNumber()); // 5
        System.out.println(s1.getStudentName());
    }
}
