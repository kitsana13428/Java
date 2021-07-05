import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader(new File("test.txt")); //อ่านไฟล์
            int data;
            while((data = reader.read()) !=-1){ //ดึงตัวอักษรทุกตัว (ไม่น้อยกว่า -1) เก็บไว้ในตัวแปร data
                System.out.printf("%c",data); //ดึงข้อมูลตัวอักษรออกมา
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
