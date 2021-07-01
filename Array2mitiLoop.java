public class Array2mitiLoop {
    public static void main(String[] args) {
        String [][] product = {
            {"ส้ม", "กล้วย", "องุ่น"},
            {"พัดลม", "ทีวี", "ตู้เย็น"},
            {"ปากกา", "ไม้บรรทัด", "สมุด"}
        };
        System.out.println("---------------");
        //Loop ข้อมูลใน Array ออกมา
        for (int row=0; row<=product.length;row++){ //ทำที่แถวก่อน 
            for(int column=0; column<product[row].length;column++){ //ทำคอลัมน์จนครบ จึงวนออกไปทำแถวต่อ
                System.out.println("แถวที่ = "+row +" คอลัมน์ที่ = "+column +" เก็บค่า = "+product[row][column]);
            }
        }
         
    }  
}
