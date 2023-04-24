package ss16_io_file_binary.bai_tap.copy_file_binary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    private static final String PATHSOURCE = "D:\\Codegym\\Module2\\src\\ss16_io_file_binary\\bai_tap\\copy_file_binary\\source.txt";
    private static final String PATHTARGET = "D:\\Codegym\\Module2\\src\\ss16_io_file_binary\\bai_tap\\copy_file_binary\\target.txt";

    public static void main(String[] args) {
        CopyFile(PATHSOURCE, PATHTARGET);
    }

    private static void CopyFile(String pathSource, String pathTarget) {
        InputStream is = null;
        OutputStream os = null;
        try {
            File file = new File(pathSource);
            File file1 = new File(pathTarget);
            System.out.println("Số byte trong file nguồn :" + file.length());
            if (file.length() == 0 || file1.length() != 0) {
                System.out.println("Vui long kiêm tra file nguồn và file đích :");
            }

            is = new FileInputStream(file);
            os = new FileOutputStream(file1);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
