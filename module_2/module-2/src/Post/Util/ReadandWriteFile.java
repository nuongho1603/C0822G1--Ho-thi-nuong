package Post.Util;

import Post.Models.Posts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWriteFile {
    public static List<String> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Posts> readFilePost(String path){
        List<Posts> postsList = new ArrayList<>();
        List<String> strings = readFile(path);
        for (String line : strings){
            String[] info = line.split(",");
            Posts posts = new Posts(Integer.parseInt(info[0]),info[1],info[2],info[3],Double.parseDouble(info[4]));
              postsList.add(posts);
        }
        return postsList;
    }

    public static  void writeFilePost(String path, List<Posts> posts){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Posts post : posts){
                bufferedWriter.write(post.nga());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}