import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader(new File("test.txt")); //อ่านไฟล์
            BufferedReader br = new BufferedReader(reader);
            String message = "";

            while((message = br.readLine()) !=null){ //ลูปข้อมูลทีละบรรทัด
                System.out.println(message); //แสดงผลทีละบรรทัด
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
