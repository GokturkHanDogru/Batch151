package replit;

public class For_While_2 {
    public static void main(String[] args) {
        int x=30;
        int y=40;
        int gcd=0;
        int lcm=0;


        for (int i=1; i<=x && i<=y;i++){
            if (x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD for 30 and 40 = "+gcd);

        for (int j=1;j<=(x*y);j++){
            if (j%x==0 && j%y==0){
                lcm=j;
            }
        }
        System.out.println("LCM for 30 and 40 = "+lcm);
    }
}
