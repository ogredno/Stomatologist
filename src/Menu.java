/**
 * Created by серега on 29.01.2015.
 */

import java.io.*;
import java.util.*;

public class Menu {
    Scanner sc = new Scanner(System.in);

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
            }
            break;
            case 2: {
                showListOfPacients(fw.pacients);
                break;
            }

            case 3: {
                fw.sortAgePacients(fw.pacients);
                showListOfPacients(fw.pacients);
                break;
            }
            case 4: {
                fw.sortNamePacients(fw.pacients);
                showListOfPacients(fw.pacients);
                break;
            }
            case 5: {
                showListOfPacients(fw.pacients);
                System.out.println("Print index to delete:");
                int choice = sc.nextInt();
                fw.deletePacient(fw.pacients, choice - 1);
            }

        }

    }

    private static void showListOfPacients(ArrayList<Pacient> pacients) {
        System.out.println("List of Pacient: ");
        for (Pacient s : pacients) {
            System.out.println(s);
        }
    }

}

