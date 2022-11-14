package FuramaResorts.Util;

import FuramaResorts.Models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
   // public static final String PATH_EMPLOYEE ="module-2\\src\\FuramaResorts\\Data\\employee.data";
  //  public static final String PATH_CUSTOMER ="module-2\\src\\FuramaResorts\\Data\\customer.data";

//    public static void writeFile(String pathFile,String string){
//        File file = new File(pathFile);
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            bufferedWriter.write(string);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void writeFileEmployee(String path, List<Employee> employees) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee : employees) {
                bufferedWriter.write(employee.info());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFileCustomer(String PATH_CUSTOMER,String string){
        File file = new File(PATH_CUSTOMER);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
