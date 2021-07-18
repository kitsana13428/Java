import java.util.Scanner;
class Assignment2{
    public static void main(String[] args) {
        //หาค่ามากกว่า หรือ น้อยกว่า 2 ตัวเลข
        Scanner kb=new Scanner(System.in);

        //ป้อนค่าเลขตัวที่ 1
        System.out.print("ป้อนเลขตัวที่ 1 : ");
        int number1=kb.nextInt(); 
        
        //ป้อนตัวที่ 2
        System.out.print("ป้อนตัวเลขที่ 2 : ");
        int number2=kb.nextInt();

        if(number1>number2){
            System.out.println(number1+" มากกว่า "+number2);
        }else if(number1<number2){
            System.out.println(number1+" น้อยกว่า "+number2);
        }else{
            System.out.println(number1+ " เท่ากับ "+number2);
        }
    }
}