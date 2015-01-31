
import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.Locale;
import static java.util.Collections.swap;
import java.text.Collator;

/**
 * Created by Александр on 31.01.2015.
 */
public class FileWork {
    Collator collator = Collator.getInstance(Locale.US);
    private static final File fileName = new File("D:/data.txt");
    public ArrayList<Pacient> pacients;

    public FileWork() {
        pacients = new ArrayList<Pacient>();
        read();
    }

    public void read() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    String[] pacientLine = s.split(",");
                    int age = 0;
                    int arm=0;
                    int sum=0;
                    try {
                        age = Integer.parseInt(pacientLine[1]);
                        arm=Integer.parseInt(pacientLine[2]);
                        sum=Integer.parseInt(pacientLine[3]);
                    } catch (IllegalFormatException e) {
                        System.out.println("Illegal age format!");
                    }
                    pacients.add(new Pacient(pacientLine[0],age,arm,sum));
                }
            } catch (IOException e) {
                System.out.println("�������� � ������� ����!");
            } finally {
                in.close();
            }
        } catch (IOException e) {
            System.out.println("���� �� �������!");
        }
    }


    public void savePacient(Pacient pacient) {
        pacients.add(pacient);
        try {
            if (!fileName.exists()) {
                fileName.createNewFile();
            }
            FileWriter out = new FileWriter(fileName, true);
            try {
                out.write(pacient.toString() + "\n");
            } finally {
                out.close();
            }
        } catch (IOException e) {
            System.out.println("�������� � ������� � ����!");
        }
    }

    public Pacient getNewPacient() {
        System.out.println("Enter Name(space)Surname:");
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter arm: ");
        int arm = scanner.nextInt();
        System.out.println("Enter sum: ");
        int sum = scanner.nextInt();
        return new Pacient(fio,age,arm,sum);
    }

    public void sortAgePacients(ArrayList<Pacient> pacients) {
        for (int i = 0; i < pacients.size() - 1; i++)
            for (int j = 0; j <pacients.size() - i - 1; j++)
                if (pacients.get(j).getAge() > pacients.get(j + 1).getAge()) {
                    swap(pacients, j, j + 1);
                }
    }

    public void sortNamePacients(ArrayList<Pacient> pacients){

        for (int i = 0; i < pacients.size() - 1; i++) {
            for (int j = 0; j < pacients.size() - i - 1; j++) {
                if (collator.compare(pacients.get(j).getFio(),pacients.get(j+1).getFio())>0) {
                    swap(pacients, j, j + 1);
                }
            }
        }
    }

}
