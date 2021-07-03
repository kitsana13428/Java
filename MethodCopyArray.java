public class MethodCopyArray {
    public static void main(String[] args) {
        int []numberA = {10,20,30,40,50,60,70};
        int []numberB = copyArray(numberA); //ดึงเมธอดมาใช้

        displayArray(numberA);
        displayArray(numberB); //ดูข้อมูล B
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
    }
    static int [] copyArray(int [] a){
        //โยนอาเรย์ A เข้ามา  
        int [] newArr = new int[a.length]; //สร้างอาเรย์เปล่าไว้รอรับ
        for(int i=0;i<a.length;i++){ //ดึงข้อมูลอาเรย์ A มา
            newArr[i] = a[i];
        }
        return newArr;
    }
}
