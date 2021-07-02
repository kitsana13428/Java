public class MethodArray2 {
    public static void main(String[] args) {
        int [] numberA = {10,40,80,120,150};
        System.out.println("ค่าสูงสุด = "+findMaxInArray(numberA)); //ส่ง numA ไปหาค่าสูงสุดในเมธอด
    }

    //หาค่าสูงสุดในอาเรย์
    static int findMaxInArray(int [] arr){
        int maxValue = arr[0]; //เก็บค่าสูงสุดเป็นค่าเริ่มต้น
        for (int i=0;i<arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
