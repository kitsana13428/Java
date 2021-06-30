import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
       //แม่สูตรคูณ
       Scanner kb= new Scanner (System.in);
       System.out.print("ป้อนสูตรคูณเริ่มต้น = ");
       int start=kb.nextInt();
       System.out.print("ป้อนสูตรคูณสุดท้าย = ");
       int stop=kb.nextInt();

       //เริ่มคำนวณ
        for (int m=start;m<=stop;m++){
            System.out.println("---------------");
            System.out.println("แม่สูตรคูณแม่ที่ = "+m);
            for(int x=1;x<=12;x++){
                System.out.println(m+" x "+x+" = "+(m*x));
            }
        }
    }
}
