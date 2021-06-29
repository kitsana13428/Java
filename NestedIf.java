import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age=kb.nextInt();
        
        //สร้างเงื่อนไขซ้อนกัน if ซ้อน if
        if(age<=15){
                if(age==15){
                System.out.println("มัธยมต้น ม.3");
            }
            else if(age==14){
                System.out.println("มัธยมต้น ม.2");
            }
            else if(age==13){
                System.out.println("มัธยมต้น ม.1");
            }
            else{
                System.out.println("ประถมศึกษา");
            }
        }else{
            if(age==18){
                System.out.println("มัธยมปลาย ม.6");
            }else if(age==17){
                System.out.println("มัธยมปลาย ม.5");
            }else if(age==16){
                System.out.println("มัธยมปลาย ม.4");
            }else{
                System.out.println("มหาลัย");
            }
        }
    }
}
