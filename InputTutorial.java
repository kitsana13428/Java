import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
        //ประกาศใช้งาน Class
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");
        String name=sc.nextLine(); //รับค่า String จากแป้น

        System.out.print("ป้อน พ.ศ = ");
        int year=sc.nextInt(); //รับค่า Int จากแป้น

        int age= (2563 - year)+1; //คำนวณอายุ
        int cis= year - 543; //คริสศักราช

        System.out.println("----------------");
        System.out.println("สวัสดีคุณ = "+name);//แสดงข้อความที่พิมพ์ ↓
        System.out.println("คุณเกิด พ.ศ = "+year);
        System.out.println("คุณเกิด ค.ศ = "+cis);
        System.out.println("คุณอายุ = "+age);
        System.out.println("----------------");
        
    }
}
