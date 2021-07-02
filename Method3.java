import java.util.Scanner;
public class Method3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนเงินเดือน = ");
        double sarary=kb.nextDouble();

        System.out.println("เงินเดือนของคุณ = "+sarary); //แสดงเงินเดือน
        double bonus=getbonus(); //สร้างตัวแปร เก็บ return getbonus

        sarary+=bonus; //เอาเงินเดือน มาบวกกับโบนัส
        System.out.println("เงินเดือน + โบนัส = "+sarary);
    }
    //สร้าง Method แล้ว return ค่าออกมา
    static double getbonus(){
        return 5000.0;
    }
}
