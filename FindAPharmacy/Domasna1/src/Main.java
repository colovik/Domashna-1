import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Pipe<String> pipe = new Pipe();

        pipe.addFilter(new ChangeCategoryFilter());
        pipe.addFilter(new FillOutNullsFilter());


        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Memovi\\FindAPharmacy\\Domasna1\\files\\AptekiRAW.csv")));
        File f=new File("E:\\Memovi\\FindAPharmacy\\Domasna1\\files\\aptekiFiltered.csv");
        PrintWriter printWriter=new PrintWriter(f);
        String pom=bufferedReader.readLine();
        while((pom!=null)){
            String p=pipe.runFilter(pom);
            printWriter.println(p);
            pom=bufferedReader.readLine();
        }
        printWriter.flush();
        printWriter.close();
    }


    }

