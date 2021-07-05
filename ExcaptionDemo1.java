public class ExcaptionDemo1 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0; //ถ้าหาร 0 จะผิดพลาดและแสดงข้อความ
            int c = a/b;
            System.out.println(c);

        }catch(Exception e){ //ถ้าติด Exception จะแสดงข้อความ
            System.out.println("ห้ามหารด้วย 0");
        }
    }
}
