package ss14_debug_exception.bai_tap.manage_spent.common;

import ss14_debug_exception.bai_tap.manage_spent.model.Spense;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Common<E> {
    protected static final String PATH ="D:\\Codegym\\Module2\\src\\ss14_debug_exception\\bai_tap\\manage_spent\\data\\data.csv";
    public Common(){
    }
    public List<Spense> readFile(String pathFile){
        List<Spense> list= new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader br = null;
        String resultStr="";
        try{
            fileReader = new FileReader(new File(pathFile));
            br=new BufferedReader(fileReader);
            String temp="";
            String[] tempArr;
            Spense e;
            while ((temp= br.readLine())!=null){
                tempArr=temp.split(",");
                e= new Spense(tempArr[0],tempArr[1],LocalDate.parse(tempArr[2]),Double.parseDouble(tempArr[3]),tempArr[4]);
                list.add(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public void writeFile(String pathFile, String inputString){
        FileWriter fileWriter=null;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter(new File(pathFile),true);
            bw = new BufferedWriter(fileWriter);
            bw.write(inputString);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
