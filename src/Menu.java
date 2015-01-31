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
             String out;
              for(int i=1; i<fw.sizeFile()+1; i++){
                  out=fw.masFile(i-1);
                System.out.print(" "+out);
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
             for(int i=0;i<n;i++){
                 for(int j=0;j<5;j++){

                 }

                 System.out.println();
             }

         }


     }

    }

}

