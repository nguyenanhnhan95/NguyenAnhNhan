package ss15_io_text_file.thuc_hanh.sum_number;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        List<Integer> sumList = new ArrayList<>();
        sumList = readFile("D:\\Codegym\\Module2\\src\\ss15_io_text_file\\thuc_hanh\\sum_number\\numbers.txt");
        writeFile("D:\\Codegym\\Module2\\src\\ss15_io_text_file\\thuc_hanh\\sum_number\\resultmax.txt", findMax(sumList));
    }

    public static List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static void writeFile(String pathFile, int max) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter br = null;
        try {
            fileWriter = new FileWriter(file, true);
            br = new BufferedWriter(fileWriter);
            br.write("Gia tri lớn nhất là :" + max);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> list) {
        int max = 0;
        for (Integer a : list) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }
}