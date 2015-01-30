/**
 * Created by серега on 30.01.2015.
 */
public class Pacient {
   private String fio;
   private int age;
   private int amt;
   private int sum;

    public Pacient(String fio, int age, int amt, int sum) {
        this.fio = fio;
        this.age = age;
        this.amt = amt;
        this.sum = sum;
    }
    public Pacient() {
        this.fio = "NULL";
        this.age = 0;
        this.amt = 0;
        this.sum = 0;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return  "" + fio +"," + age +"," + amt +"," + sum ;
    }
}
