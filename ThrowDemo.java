import java.util.Scanner;
public class ThrowDemo {
    public static void main(String[] args) {
        //โปรแกรม Atm 
        try {
            int balance = 10000;
            Scanner kb=new Scanner(System.in);
            System.out.print("ป้อนจำนวนเงิน : ");
            int withdraw = kb.nextInt();
            //เงื่อนไข ห้ามติดลบ และเลข 0
            if(withdraw<=0){
                throw new Exception ("จำนวนเงินไม่ถูกต้อง"); //ส่งข้อมูลไป catch 
            }
            //ถอนเงินห้ามเกิน balance
            if(withdraw > balance){
                throw new Exception ("จำนวนเงินไม่พอ"); //ส่งข้อมูลไป catch 
            }

            balance-=withdraw; // ยอดถอนไปลบ เงินที่มี
            System.out.println("ถอนเงิน = "+withdraw);
            System.out.println("จำนวนเงินคงเหลือ = "+balance);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }    
}
