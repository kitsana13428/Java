import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age=sc.nextInt();

        if(age>15){
            System.out.println("นาย/นางสาว");
        }
        System.out.print("จบโปรแกรม");
        
    }
}
