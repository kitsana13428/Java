import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนเลขเดือน : ");
        int month=kb.nextInt();
        String name;

        switch (month) {
            case 1:
                name = "มกราคม";
                break;
            case 2:
                name = "กุมภาพันธุ์";
                break;
            case 3:
                name = "มีนาคม";
                break;
            default:
                name = "เดือนอื่นๆ";
                break;
        }
        System.out.print(name);
    }
}
