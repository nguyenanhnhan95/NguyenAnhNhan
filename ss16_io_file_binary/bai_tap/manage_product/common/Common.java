package ss16_io_file_binary.bai_tap.manage_product.common;

import ss16_io_file_binary.thuc_hanh.read_write_student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Common<E> {
    protected static final String PATH = "D:\\Codegym\\Module2\\src\\ss16_io_file_binary\\bai_tap\\manage_product\\data\\data.csv";

    public List<E> readFile(String path) {
        List<E> arrayA = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file = new File(path);
            if (file.length() == 0) {
                arrayA = new ArrayList<>();
            } else {
                fis = new FileInputStream(path);
                ois = new ObjectInputStream(fis);
                arrayA = (List<E>) ois.readObject();
                fis.close();
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return arrayA;
    }

    public void writeFile(String path, List<E> e) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
