/**
 * Created by серега on 30.01.2015.
 */
import java.io.*;
public class FileWork {

    public static String read() throws FileNotFoundException {
        File f = new File("D:/data.txt");
        StringBuilder sb = new StringBuilder();
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(f));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public  void update(String newText) throws FileNotFoundException {
        File fileName = new File("D:/data.txt");
        PrintWriter pw=new PrintWriter(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = read();
        System.out.println(oldFile);
        System.out.println(newText);
        //sb.append(newText);
        //pw.write(sb.toString());

    }




    }











