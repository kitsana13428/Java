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
    }
}
