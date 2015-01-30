/**
 * Created by серега on 29.01.2015.
 */

import java.io.*;
import java.util.*;
public class Menu {

   public void menu(){
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

    public void  menu(int chice){
        Scanner sc=new Scanner(System.in);
        FileWork fw=new FileWork();
        String info = null;
     switch (chice){
         case 1:{
             System.out.println("Input Name(,)Surname(,)Age(,)Arm(,)Sum(,) :");
              info = sc.nextLine();
             try {
                 fw.update(info);
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
             break;

         }
         case 2: {

             String line = null;

             try {
                 line = fw.read();
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
             String[] list=line.split(",");

              for(int i=1; i<list.length+1; i++){
                System.out.print(" "+list[i-1]);
                if(i%5==0){
                    System.out.print("\n");
                }
            }
         }
         case 3:{
             String line = null;
             String[] list;

             try {
                 line = fw.read();
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
             list = line.split(",");
             int n=list.length/5;
             String[][] mas=new String[n][5];
             for(int i=0;i<n;i++){
                 for(int j=0;j<5;j++){
                     mas[i][j]=list[j+i];
                     System.out.print(mas[i][j]+" ");
                 }
                 System.out.println();
             }

         }


     }

    }

}

