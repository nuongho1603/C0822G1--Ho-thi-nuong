package ss5.practice;

public class TestStudent {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111, "Nga");
        Student student2 = new Student(112, "Lan");
        Student student3 = new Student(163, "Nuong");

        student1.display();
        student2.display();
        student3.display();
    }
}
