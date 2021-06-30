public class Whileloop {
    public static void main(String[] args) {
        int count=1; 
        //while loop ไม่รู้จักจำนวนรอบที่ชัดเจน
        while(true){ //วนลูปไปเรื่อยๆ ไม่สิ้นสุด!
            System.out.println("รอบที่ = "+count+ " Hello World");
            count++; //+1
            if(count>100){ //สั่งหยุดเมื่อค่าเท่ากับ 100
                break;
            }
        }
    }    
}
