public class VaribleArg {
    public static void main(String[] args) {
        //การรวมค่ากี่ตัวก็ได้
        summation(10,20,30,40,50,60,70,80,90); //ส่งค่าไปเมธอด
    }

    //เมธอด รวมค่ากี่ตัวก้ได้
    public static void summation(int...number){
        int sum =0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("ผลรวม = "+sum);
    }
}
