public class String1 {
    public static void main(String[] args) {

        String a="100", b="200";

        int c;
        double d;
        //String -> int
        c=Integer.parseInt(a);
        c=c+50; //แปลง a เป็น int แล้วเอามาบวก c

        //String -> Double
        d=Double.parseDouble(b);
        d=d+2.55;
        System.out.println(c);
        System.out.println(d);
    }
    
}
