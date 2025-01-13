package BasicConcepts;

public class StringConcept {

    public static void main(String[] args) {
        //String are immutable and final
        String s1 = "Priyanshu"; //String s1 and s3 are referring to the same String value in memory
        String s2 = "Rathore";
        String s3 = "Priyanshu";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
