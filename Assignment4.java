import java.util.Scanner;
public class Assignment4 {
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
        System.out.println("ค่าดัชนีมวลกาย = "+bmi);

        /* เงื่อนไข Bmi
        น้อยกว่า 18 = ต่ำว่าเกณ
        18.5 - 22.9 = สมส่วน
        23.0 - 24.9 = น้ำหนักเกิน
        25.0 - 29.9 = โรคอ้วน
        มากกว่า 30 = โรคอ้วนอันตราย
        */
        if(bmi<18){
            System.out.println("ผอมเกินไป ต่ำกว่าเกณฑ์");
        }else if(bmi >=18.5 && bmi<=22.9){
            System.out.println("พอดี สมส่วน");
        }else if(bmi >=23.0 && bmi<=24.9){
            System.out.println("เริ่มอ้วน น้ำหนักเกิน");
        }else if(bmi >=25.0 && bmi<=29.9){
            System.out.println("อ้วนแล้ว โรคอ้วน");
        }else if(bmi >=30.00 && bmi<=70.00){ 
            System.out.println("อ้วนมาก โรคอ้วนอันตราย");
        }else{
            System.out.println("ไม่ทราบค่า");
        }
        System.out.println("-------------------");
    }
}
