package ss10.exercise.exercise1;

import ss5.exercise.exercise2.Student;

import javax.xml.soap.SOAPElementFactory;

public class MyArrayListTest {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1, "Trung");
        Student b = new Student(2, "Nga");
        Student c = new Student(3, "Nương");
        Student m = new Student(4, "Lan");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(m);

//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());

//            System.out.println(studentMyArrayList.size());
//           System.out.println(studentMyArrayList.get(2).getName());


//        System.out.println(studentMyArrayList.indexOf(c));
       System.out.println(studentMyArrayList.contains(b));
//        newArrayList = studentMyArrayList.clone();
//       Student student = newArrayList.remove(2);
////        for (int i = 0; i < newArrayList.size() ; i++) {
////            System.out.println(newArrayList.get(i).getName());
//        System.out.println(student.getName());
        //}
        }
    }


