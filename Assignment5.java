import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงิน = ");
        int money=kb.nextInt();
        
        System.out.println("จำนวนเงิน = "+money);
        //เงื่อนไขการถอนเงิน 
        if(money>=1000){
            System.out.println("1000 บาท = "+(money/1000)+" ใบ");
            money%=1000;
        }if(money>=500){
            System.out.println("500 บาท = "+(money/500)+" ใบ");
            money%=500;
        }if(money>=100){
            System.out.println("100 บาท = "+(money/100)+" ใบ");
            money%=100;
        }if(money>=50){
            System.out.println("50 บาท = "+(money/50)+" ใบ");
            money%=50;
        }
    }
    
}
