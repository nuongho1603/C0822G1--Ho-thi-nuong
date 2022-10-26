package ss16.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    public static void readFile(String pathFile) {
        List<Nation> nationList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] info = line.split(",");
                Nation nation = new Nation(Integer.parseInt(info[0]), info[1], info[2]);
                nationList.add(nation);

            }
            bufferedReader.close();

            for (Nation nation : nationList) {
                System.out.println(nation.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        readFile("module-2\\src\\ss16\\exercise\\exercise2\\nation.csv");
    }
}
