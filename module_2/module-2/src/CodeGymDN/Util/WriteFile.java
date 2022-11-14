package CodeGymDN.Util;

import CodeGymDN.model.Student;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeFileStudent(String path, List<Student> list){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : list){
                bufferedWriter.write(student.showInfo());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
