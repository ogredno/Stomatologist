/**
 * Created by серега on 29.01.2015.
 */

import java.io.*;
public class Menu {
    public static void main (String args[]){
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        String fio;
        int age;
        int amt;
        int sum;


       FileWork streamExam = new FileWork();

        int choice=0;
       Pacient p=new Pacient();




        String[] menu={"(1)Данные о пациенте", "(2)Добавить нового пациента","(3)Список пациентов кабинета","(4)Выход"};

while (choice!=4){
    for(int i=0; i<menu.length; i++){
        System.out.println(menu[i]);
    }

    try {
        choice=Integer.parseInt(br.readLine());
    } catch (IOException e) {
        e.printStackTrace();
    }
    if(choice==2){
       System.out.println("Введте ФИО нового пациента(через пробел):");
        try {
            p.setFio(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Введте возрост");
        try {
            p.setAge(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("количество обращений");
        try {
            p.setAmt(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("общая сумма");
        try {
            p.setSum(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            streamExam.write(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }else if(choice==1){
     System.out.println(p);
    }
}


    }
}
