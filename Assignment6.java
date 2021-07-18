import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        //แปลงค่าอุณหภูมิ
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนอุณภูมิ (ฟาเรนไฮน์) = "); //กรอกฟาเรนไฮน์
        float fahren=kb.nextFloat();
        float cel = (fahren-32)*5/9; //คำนวณไฟเซลเซียส
        System.out.println(fahren+" องศาฟาเรนไฮร์ = "+ cel +" องศาเซลเซียส");
    }
}
