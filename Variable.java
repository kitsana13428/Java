class Variable {
    public static void main(String[] args) {
        int num1= 10;//ค่าเริ่มต้น 10 , 20
        final int num2=20; //ใส่ final ทำให้เป็นค่าคงที่ ไม่สามารถแก้ไขได้
        num1=50; //เปลี่ยนค่า num 1
        System.out.println("แสดงค่าที่ 1 = "+num1); //นำตัวอักษรมา + กับตัวแปร num
        System.out.println("แสดงค่าที่ 2 = "+num2);
        /////////////////////////////////////////
        System.out.println(Integer.MAX_VALUE); //ทดสอบการเก็บค่าสูงสุด
        System.out.println(Integer.MIN_VALUE); //ทดสอบการเก็บต่ำสูงสุด
        /////////////////////////////////////////

    }
}
