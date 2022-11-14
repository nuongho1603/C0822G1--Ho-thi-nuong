package CodeGymDN.Util;

import CodeGymDN.model.Student;
import FuramaResorts.Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Student> readFile(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        List<Student> studentList = new ArrayList<>();
        String line;
        String[] info;
        Student student = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                student = new Student(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], Double.parseDouble(info[5]));
                studentList.add(student);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }
}
