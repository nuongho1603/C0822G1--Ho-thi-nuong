package ss10.exercise.exercise2;

import ss10.exercise.exercise1.MyArrayListTest;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
         private int id;
         private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Trung");
        Student student2 = new Student(2,"Lan");
        Student student3 = new Student(3,"Nga");
        Student student4 = new Student(4,"Nuong");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);

        myLinkedList.remove(3);

        for (int i = 0; i <myLinkedList.size(); i++) {
            Student student = (Student)myLinkedList.get(i);
            System.out.println(student.getName());

        }
    }
}
