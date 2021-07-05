public class StringMethod {
    public static void main(String[] args) {

        //เปรียบเทียบ String คำนำหน้า ถ้านาย = ชาย
        String fullName = "นายกฤษณะ รัตนพลแสน";

        boolean result=fullName.startsWith("นาย");
        if(result){
            System.out.println("เพศชาย");
        }else{ //ถ้าไม่ใช่ = หญิง
            System.out.println("เพศหญิง");
        }
        
        //String => Array ใช้สัญลักษณ์
        String data = "มะม่วง,กล้วย,ขนุน,ลำไย";
        String [] fruit = data.split(","); //ใช้ , แบ่งให้เป็น Array

        System.out.println(fruit[1]);
    }
}
