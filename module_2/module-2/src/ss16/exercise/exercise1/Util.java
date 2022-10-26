package ss16.exercise.exercise1;

import java.io.*;

public class Util {
    public static String readFile(String pathFile) {
        File file = new File(pathFile);
        String str = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void writeFile(String pathFile, String string) {
        File file = new File(pathFile);
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

    public static void main(String[] args) {
        Util.writeFile("module-2\\src\\ss16\\exercise\\exercise1\\target_file", readFile("module-2\\src\\ss16\\exercise\\exercise1\\source_file"));
    }

}

