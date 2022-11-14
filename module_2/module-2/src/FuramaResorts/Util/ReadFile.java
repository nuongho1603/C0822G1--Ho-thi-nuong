package FuramaResorts.Util;

import FuramaResorts.Models.Employee;
import ss16.exercise.exercise2.Nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
//    public static List<String> readFile(String pathFile) {
//        File file = new File(pathFile);
//        List<String> stringList = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                stringList.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return stringList;
//    }


    public static List<Employee> readFileEmployee(String path) {
        List<Employee> employees = new ArrayList<>();
        File file = new File(path);
        Employee employee = null;
        String[] info;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                info = line.split(",");
                 employee = new Employee( info[0], info[1], info[2],
                        Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5],
                        Integer.parseInt(info[6]) , info[7], info[8], Double.parseDouble(info[9]));
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return employees;
    }

//    public static String readFileCustomer(String PATH_CUSTOMER) throws IOException {
//        File file = new File(PATH_CUSTOMER);
//        StringBuilder str = new StringBuilder();
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            str.append(line);
//        }
//        bufferedReader.close();
//        return str.toString();
//    }
//
//    public static String readFileBooking(String pathFile) throws IOException {
//        File file = new File(pathFile);
//        String str = "";
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            str += line;
//        }
//        bufferedReader.close();
//        return str;
//    }
}
