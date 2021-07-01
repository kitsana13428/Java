public class Method {
    public static void main(String[] args) {
        //เรียกใช้งานเมธอด
        display();
        plus();
    }
    //สร้างเมธอด
    static void display(){
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("Hello World");
    }

    static void plus(){
        //เมธอดผลรวม
        int a=5;
        int b=10;
        int c=a+b;
        System.out.println("ผลบวก = "+c);
    }
}
