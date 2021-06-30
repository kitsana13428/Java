public class DoWhileLoop {
    public static void main(String[] args) {
        int count=0;
        do{
            //ทำก่อนหนึ่งรอบ ถ้าจริงจะกลับมาทำใหม่
            System.out.println(count);
            count++; 
        }while(count<5);//ถ้าน้อยกว่า 5 จะหยุด
    }
}
