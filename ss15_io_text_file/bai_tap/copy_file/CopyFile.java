package ss15_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    private static final String fileSourse = "D:\\Codegym\\Module2\\src\\ss15_io_text_file\\bai_tap\\copy_file\\source.txt";
    private static final String fileTaret = "D:\\Codegym\\Module2\\src\\ss15_io_text_file\\bai_tap\\copy_file\\target.txt";

    public static void main(String[] args) {
        writeFile(fileTaret, readFile(fileSourse));
    }

    public static String readFile(String pathFile) {
        BufferedReader br = null;
        FileReader fileReader = null;
        String result = "";
        try {
            fileReader = new FileReader(new File(pathFile));
            br = new BufferedReader(fileReader);
            String tem = "";
            while ((tem = br.readLine()) != null) {
                result += (String) tem + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void writeFile(String pathTarget, String data) {
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter(new File(pathTarget));
            bw = new BufferedWriter(fileWriter);
            bw.write(data);
            bw.write("Số ký là =" + countWord(readFile(fileSourse)));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int countWord(String string) {
        String countStr = "";
        String[] arrayA = string.split("\n");
        for (String a : arrayA) {
            countStr += a;
        }
        return countStr.length();
    }
}
