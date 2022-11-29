public class FirstCode {
    public static void main(String[] args) {
        int num = 500_000;  // 4bytes -> 32bits
        num = 8;

        float percent1 = 5.5f;  // 4bytes
        double percent2 = 5.5;  // 8bytes
        double percen2a = 5;  //implicit conversion - will print 5.0 as output
        short percent3 = 5;     // 2bytes -> 16bits (-32768 - +32768)
        byte percent4 = 5;     // 1byte -> 8bytes (-128 - + 127)
        long percent5 = 5000000000l;    // 8bytes
        
        char c = 'A';
        c = 66; 
        System.out.println(c);  // B - return ASCI - 66 - letter B
        
        int randomNumber = (int)5.6;
        System.out.println(randomNumber); //5 .  type casting


        System.out.print("Hello World!");
    }
}
