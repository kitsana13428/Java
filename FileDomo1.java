import java.io.*;
public class FileDomo1 {
    public static void main(String[] args) {
        //สร้างไฟล์พร้อมเขียน
        try {
            FileWriter writer = new FileWriter(new File ("Test.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("NISIT30001   60\n");
            bw.write("NISIT30002   70\n");
            bw.write("NISIT30003   50\n");
            bw.write("NISIT30015   90\n");
            bw.write("NISIT30055   85\n");
            bw.write("NISIT30060   55\n");
            bw.write("NISIT30022   65\n");
            bw.write("NISIT30022   40\n");
            bw.close();
            System.out.println("เขียนไฟล์เสร็จแล้วครับ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
