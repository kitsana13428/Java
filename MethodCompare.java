public class MethodCompare {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50,50};
        int [] numberB = {10,20,30,40,50};

        System.out.println("ผลการเปรียบเทียบ = "+compareArray(numberA, numberB)); //ส่งค่าไปเมธอด เปรียบเทียบเท่ากันไหม
    }

    static boolean compareArray (int [] a, int [] b){
        if(a.length != b.length) return false; //เช็คจำนวน ถ้าไม่เท่ากันให้ false เลยไม่ต้องทำข้างล่าง
        //เทียบตัวว่าเท่ากันไหม ↓
        for(int i=0;i<a.length;i++){
            if(a[i] !=b[i]){
                return false; //ไม่เท่าให้ false 
            }           
        }
        return true; //ถ้าเท่ากันให้ true
    }
}
