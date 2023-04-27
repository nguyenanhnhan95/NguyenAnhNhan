package ss19_case_study_module2.utils;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public void writeFile(String objString, String path) {
        FileWriter fw = null;
        BufferedWriter br = null;
        try {
            fw = new FileWriter(new File(path));
            br = new BufferedWriter(fw);
            br.write(objString);
            br.newLine();
            br.flush();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile(String path) {
        List<String> objectString = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File(path));
            br = new BufferedReader(fr);
            String line = "";
            String[] arrayA;
            while ((line = br.readLine()) != null && !line.equals("")) {
                objectString.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objectString;
    }
}
