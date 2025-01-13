package PractiseTest;

public class LongIntegerValue {

    public static void main(String[] args){

        long longWithoutL = 1000*60*60*24*365;
        long longWithL = 1000*60*60*24*365L;

        System.out.println(longWithoutL);
        // 31536000000 - 36 bit - 11101010111101100010010110000000000
        // Since the limit is 32 bit
        // So it is converting to 32 from 36 bit - 1010111101100010010110000000000
        // By removing first 4 values
        // So for 32 bit result is 1471228928 - 1010111101100010010110000000000
        System.out.println(longWithL);
    }

}
