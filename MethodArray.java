public class MethodArray {
    public static void main(String[] args) {

        int [] numberA={10,20,30,40,50,60,70,80,90}; //ข้อมูลอาเรย์
        displayArray(numberA); //ส่งค่าไปยังเมธอด
    }

    //สร้างเมธอดที่ลูปอาเรย์
    static void displayArray(int [] arr){
        System.out.print("{"); //แต่งผลลัพธ์
        //ลูปข้อมุลในอาเรย์
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

            if(i<arr.length){
                System.out.print(","); //แต่งผลลัพธ์
            }
        }
        System.out.println("}"); //แต่งผลลัพธ์
        System.out.print("---------จบโปรแกรม---------"); //แต่งผลลัพธ์
    }
}
