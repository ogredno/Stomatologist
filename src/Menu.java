/**
 * Created by серега on 29.01.2015.
 */

import java.io.*;
import java.util.*;

public class Menu {

    public void menu() {
        System.out.println("(1) Add new client");
        System.out.println("(2) List clients");
        System.out.println("(3) List clients with sort age");
        System.out.println("(4) List clients with sort name");
        System.out.println("(5) Delete client");
        System.out.println("(6) Redact client");
        System.out.println("(7) Show clients who have 5 and more amt");
        System.out.println("(8) Show clients with sum: ");
        System.out.println("(9) Exit");
    }

    public void menu(int chice) {
        Scanner sc = new Scanner(System.in);
        FileWork fw = new FileWork();
        String info = null;
        switch (chice) {
            case 1: {
                fw.savePacient(new FileWork().getNewPacient());
            }break;
            case 2: {
                showListOfPacients(fw.pacients);
                break;
                }

            case 3: {
                new FileWork().sortAgePacients(fw.pacients);
                showListOfPacients(fw.pacients);
            break;
            }
            case 4: {
                new FileWork().sortNamePacients(fw.pacients);
                showListOfPacients(fw.pacients);
                break;
            }


        }

    }
    private static void showListOfPacients(ArrayList<Pacient> pacients) {
        System.out.println("List of Students: ");
        for (Pacient s : pacients) {
            System.out.println(s);
        }
    }

}

