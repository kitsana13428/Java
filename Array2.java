public class Array2 {
    public static void main(String[] args) {
        //แสดง Array ทั้งหมดด้วยการ loop
        int []number={10,20,30,40,50,60,70,80,90,100,110,120,130};
        int count = number.length; //จำนวนของ Array เก็บไว้ใน count

        for(int i=0;i<=count;i++){ //loop ข้อมูล Array
            System.out.println(number[i]);
        }
    }
}
