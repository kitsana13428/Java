import java.util.Scanner;
public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนเกรดของคุณ : ");
        int grade=sc.nextInt();

        if(grade>=80){
            System.out.println("สุดยอดเลยคุณเก่งมากได้เกรด A ");
        }
        else if(grade>=70){
            System.out.println("คุณเก่งมากๆได้เกรด B ");
        }
        else if(grade>=60){
            System.out.println("เยี่ยมเลยคุณได้เกรด C ");
        }
        else if(grade>=50){
            System.out.println("คุณต้องพยามหน่อยได้เกรด D ");
        }
        else{
            System.out.println("แย่จังสู้ต่อไปนะได้เกรด F ");
        }
        System.out.print("จบโปรแกรม");
    }
    
}
