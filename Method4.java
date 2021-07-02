public class Method4 {
    public static void main(String[] args) {
        int result=maxNumber(5,6); //ป้อนค่า
        System.out.println("เลขที่มากที่สุด = "+result); //แสดงผล

        int sum=summation(1, 2, 3);
        System.out.println("ผลรวม = "+sum);
    }

    //เปรียบเทียบตัวเลข 2 ตัว
    static int maxNumber(int a, int b){
        //ประมวลผล
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
    //ผลรวม 3 ตัว
    static int summation(int a, int b, int c){
        int total= a+b+c;
        return total;
    }
}
