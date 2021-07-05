import java.io.*;
public class FileDomo1 {
    public static void main(String[] args) {
        //สร้างไฟล์พร้อมเขียน
        try {
            FileWriter writer = new FileWriter(new File ("Test.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Hello World 123\n");
            bw.write("กฤษณะ รัตนพลแสน\n");
            bw.write("สวัสดีครับ");
            bw.close();
            System.out.println("เขียนไฟล์เสร็จแล้วครับ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
