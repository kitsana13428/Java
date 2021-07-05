import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class CalculateGrade {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("Test.txt")); //รับค่าจากไฟล์
            output = new PrintWriter(new File("Grade.txt")); //ส่งออกข้อมูลเป็นไฟล์
            String nisit = "";
            String grade = "";
            while(input.hasNext()){
                nisit = input.nextLine();
                int pos = nisit.indexOf(" "); //เอาตำแหน่งหลังช่องว่าง
                // System.out.print(pos);
                String scoreStr = nisit.substring(pos,nisit.length()); //หาตำแหน่งคะแนน
                scoreStr = scoreStr.trim(); //trim ลบช่องวรรคออก
                double score = Double.parseDouble(scoreStr); //แปลงสติงเป็น => ดับเบิ้ล

                if(score>=80){
                    grade = "A";
                }else if(score>=70){
                    grade = "B";
                }else if(score>=60){
                    grade = "C";
                }else if(score>=50){
                    grade = "D";
                }else{
                    grade = "FFF";
                }
                output.println(nisit+"  "+grade); //ส่งออกข้อมูล เป็นไฟล์ออกไป
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        output.close();
    }
}
