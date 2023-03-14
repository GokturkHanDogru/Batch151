package replit;

public class For_While_7 {
    public static void main(String[] args) {
        int x=6;
        int i=1;
        int sum=0;

        while (i<x){
          if (x%i==0){
              sum +=i;
          }
            i++;
        }

        if (sum==x){
            System.out.println(x+" is Perfect Number");
        }else {
            System.out.println(x+" is not Perfect Number");
        }
    }
}
