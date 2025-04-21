public class SDiamond {

    public static void main(String[] args) {

        int n = 5;

        for (int i=0; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }

            System.out.println();

        }

        for (int a=n-1; a>=1; a--){
            for (int b=1; b<=n-a; b++){
                System.out.print(" ");
            }

            for (int c=1; c<=a*2-1; c++){
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
