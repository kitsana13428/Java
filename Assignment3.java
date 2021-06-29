import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.print("ป้อนเลขจำนวนเต็ม : ");
        int num=kb.nextInt(); //เก็บค่าใน num

        // num % 2 ลงตัว = คู่
        // หาร 2 ไม่ลงตัว = คี่
        if(num%2==0){
            System.out.println(num+" เป็นเลขคู่");
        }else{
            System.out.println(num+" เป็นเลขคี่");
        }

    }
}
