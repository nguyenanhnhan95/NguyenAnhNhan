package ss15_io_text_file.bai_tap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        List<Nation> resultNational = readFile("D:\\Codegym\\Module2\\src\\ss15_io_text_file\\bai_tap\\read_file\\file.csv");
        for (Nation a : resultNational) {
            System.out.println(a.toString());
        }
    }

    public static List<Nation> readFile(String pathFile) {
        List<Nation> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader br = null;

        try {
            fileReader = new FileReader(new File(pathFile));
            br = new BufferedReader(fileReader);
            String[] arrayA;
            String temp;
            while ((temp = br.readLine()) != null) {
                arrayA = temp.split(",");
                Nation nation = new Nation(arrayA[0], arrayA[1], arrayA[2]);
                list.add(nation);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileReader.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
