package NewPractiseProgram;

public class CapitalizeFirstLetterOfSentence {

    public static void main(String[] args) {

        String str = "my name is priyanshu rathore";
        StringBuilder str2 = new StringBuilder();
        String[] input = str.split("\\s+");

        for(String word : input){
            char[] c = word.toCharArray();
            StringBuilder str1 = new StringBuilder();
            for(int i = 0; i<=c.length-1; i++){
                if(i == 0) {
                    String upperCase = Character.toString(c[i]).toUpperCase();
                    str1.append(upperCase);
                }else{
                    str1.append(c[i]);
                }
            }

            str2.append(str1).append(" ");
        }

        System.out.println(str2.toString().trim());
    }
}
