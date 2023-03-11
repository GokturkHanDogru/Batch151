package replit;

public class If_Else_8 {
    public static void main(String[] args) {
        String word = "Mustafa";

        if (word.length()>2){
            String lastTwo = word.substring(word.length()-2);
            System.out.println(lastTwo+lastTwo+lastTwo);
        }
    }
}
