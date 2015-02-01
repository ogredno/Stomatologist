import java.util.Scanner;

/**
 * Created by серега on 31.01.2015.
 */
public class Main {
    public static void main(String args[]){
        Menu menu=new Menu();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=9){
            menu.menu();
           choice= sc.nextInt();
            if(choice<=0 || choice>9){
             System.out.println("Pls Input number of menu");
                break;
            }else {
                menu.menu(choice);
            }
        }
    }
}
