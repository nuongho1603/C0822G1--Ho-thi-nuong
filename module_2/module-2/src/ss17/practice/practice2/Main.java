package ss17.practice.practice2;

import com.sun.org.apache.xerces.internal.xs.StringList;
import s12.practice.practice1.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Students> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Students(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Students(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Students(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Students(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("Student.txt",students);

        List<Students> studentDataFromFile = readDataFromFile("student.txt");
        for (Students students1 : studentDataFromFile){
            System.out.println(students1);
        }
    }

    public static List<Students> readDataFromFile(String path){
        List<Students> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students =(List<Students>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  students;
    }
}
