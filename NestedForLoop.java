public class NestedForLoop {
    public static void main(String[] args) {
        //loop นอก
        for (int i=1;i<=3;i++){ //ทำลูปนอก 1 ครั้ง
            System.out.println("รอบนอก = "+i);
            //รอบใน
            for(int a=1;a<=5;a++){ //ทำลูปในครบจำนวน แล้วออกไปทำลูปนอกได้
                System.out.println("รอบใน = "+a);
            }
        }
    }
}
