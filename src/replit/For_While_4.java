package replit;

public class For_While_4 {
    public static void main(String[] args) {
factorial(6) ;
    }

    public static int factorial(int x){
        int total =1;
        for (int i=1;i<=x;i++){
            total *= i;

        }
        System.out.print(x+"!=");
        for (int k =6 ;k>=1;k--){
          if(k!=1){
              System.out.print(k+"*");
          }
          else {
              System.out.print("1");
          }
        }
        System.out.print("="+total);
        return total;

    }
}
