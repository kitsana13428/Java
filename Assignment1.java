import java.util.Scanner;
class Assignment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ป้อนน้ำหนัก
        System.out.print("ป้อนน้ำหนัก (kg) :");
        double weight=sc.nextDouble();
        //ป้อนส่วนสูง
        System.out.print("ป้อนส่วนสูง (cm) :");
        double height=sc.nextDouble();
        height = height/100; //แปลงค่า เซนติเมตร เป็น เมตร

        double bmi = weight/(height*height); //สูตรคำนวณ bmi

        //แสดงผล
        System.out.println("น้ำหนัก = "+weight);
        System.out.println("ส่วนสูง = "+height);
        System.out.print("ค่าดัชนีมวลกาย = "+bmi);
    }
}