class typecast {
    public static void main(String[] args) {
        //แปลงค่า เล็ก -> ใหญ่ 
        /*
        int numInt = 10;
        double numDouble = numInt;
        */

        //แปลงค่าจาก ใหญ่ -> เล็ก
        double numDouble = 10.0;
        int numInt=(int)numDouble; //ต้องมี (int) อยู่ข้างหน้า

        System.out.println(numInt);
        System.out.println(numDouble);
    }
}