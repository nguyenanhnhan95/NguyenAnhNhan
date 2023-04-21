package ss15_io_text_file.thuc_hanh.max_value;

import java.io.*;

public class WriteTextFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("filenumbers.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
