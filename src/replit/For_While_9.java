package replit;

public class For_While_9 {
    public static void main(String[] args) {

        int x=1238;
        int firstDigit;
        int newNumber;
        System.out.println("Reverse Of The Number: ");
        for (int i=0;i<4;i++){
            firstDigit=x%10;
            System.out.print(firstDigit);
            newNumber=(x/10);
            x=newNumber;
        }

    }
}
