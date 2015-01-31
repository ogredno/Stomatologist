/**
 * Created by серега on 30.01.2015.
 */
public class Pacient {
    private String fio;
    private int age;
    private int arm;
    private int sum;


    public Pacient(String fio, int age, int arm, int sum) {
        this.fio = fio;
        this.age = age;
        this.arm = arm;
        this.sum = sum;
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

    public int getArm() {
        return arm;
    }

    public void setArm(int arm) {
        this.arm = arm;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return fio+" "+age+" "+arm+" "+sum;
    }
}
