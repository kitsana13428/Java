public class MethodSearchArr {
    public static void main(String[] args) {
        String [] color={"แดง", "ส้ม", "ม่วง", "ขาว"};

        System.out.println(searchColor(color,"ขาว"));//หาตำแหน่งในอาเรย์
    }

    //สร้างเมธอดค้นหาตำแหน่ง
    static int searchColor (String [] arr, String name ){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals (name) ){ //ใช้ equals แทน =
                return i;
            }
        }
        return -1;
    }
}
