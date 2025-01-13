package BasicConcepts;

public class ArrayConcept {

    public static void main(String[] args){
        staticArray();
        objectArray();
    }
    public static void staticArray(){
        int[] i = new int[3];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;

        System.out.println("Int Array:");
        for(int j=0; j<i.length; j++){
            System.out.println(i[j]);
        }

        float[] k = new float[2];
        k[0] = 12.35F;
        k[1] = 14.24F;

        System.out.println("Float Array:");
        for(float l : k){
            System.out.println(l);
        }

        char[] a = new char[4];
        a[0] = '2';
        a[1] = 'V';
        a[2] = '$';
        a[3] = 'p';

        System.out.println("Character Array:");
        for(char b : a){
            System.out.println(b);
        }

        String[] str = new String[2];
        str[0] = "Priyanshu";
        str[1] = "Rathore";

        System.out.println("String Array:");
        for(String c : str){
            System.out.println(c);
        }
    }
    public static void objectArray(){
        Object[] obj = new Object[5];
        obj[0] = 'R';
        obj[1] = 13.59;
        obj[2] = 195;
        obj[3] = true;
        obj[4] = "Priyanshu";

        for(Object d : obj){
            System.out.println(d);
        }
    }
}
