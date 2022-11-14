package Demo;

import FuramaResorts.Models.Employee;
import javafx.geometry.Pos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
//    public static List<Post> readFile(String path) {
//        File file = new File(path);
//        BufferedReader bufferedReader = null;
//        List<Post> postList = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line;
//
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] info = line.split(",");
//                Post post = new Post(info[0], Integer.parseInt(info[1]), info[2]);
//                postList.add(post);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return postList;
//    }

    public static List<Post> readFilePost(String path) {
        File file = new File(path);
        List<Post> postList = new ArrayList<>();
        String line;
        String[] info;
        BufferedReader bufferedReader = null;
        Post post = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                post = new Post(info[0], Integer.parseInt(info[1]), info[2]);
                postList.add(post);
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
        return postList;
    }

    public static void writeFile(String path, List<Post> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Post p : list) {
                bufferedWriter.write(p.convertLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
