/**
 * Created by серега on 30.01.2015.
 */
import java.io.*;
public class FileWork {

    public static String read() throws FileNotFoundException {
        File f = new File("D:/data.txt");
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(f));

        String s = null;
        try {
         s=in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return s;
    }


    public void update(String newText) throws FileNotFoundException {
        File file = new File("D:/data.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter out = new FileWriter(file, true);
            try {
                out.write(newText.toString());
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

   /* public static int rdLine(int i) {
        File file = new File("D:/data.txt");
        String[] sum;
        int[] sum1;
        int[] summax=new int[10];
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));

            try {
                String s;
                while ((s = in.readLine()) != null) {
                    s = in.readLine();
                    sum = s.split(",");
                    sum1 = Integer.parseInt(sum[3]);
                    if (summax < sum1) {
                        summax = sum1;
                    }
                }finally{
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return sum1;
        }

    }*/
}










