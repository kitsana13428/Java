public class Method2 {
    public static void main(String[] args) {
        //การเรียกใช้
        display("สวัสดีครับ"); //ข้อมูลส่งไปเป็น Argument
        fullName("คอป","กฤษณะ");//ส่งข้อมูลแบบ 2 ค่า
        plus(5, 15);//ส่งตัวเลข หาผลบวก
    }
    //การสร้างเมธอด ส่ง1ค่า
    static void display(String message){ //message parameter
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("แสดงคำว่า = "+message);
    

    }
    
    //เมธอด ส่ง 2 ค่า
    static void fullName(String firstname, String lastname){
        System.out.println("ชื่อ = "+firstname+" นามสกุล = "+lastname);
    }

    //ผลบวก 2 ค่า
    static void plus(int a, int b){
        int c= a+b;
        System.out.println("ผลบวกของ "+a+" + "+b+" = "+c);
    }
}
