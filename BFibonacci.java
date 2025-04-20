public class BFibonacci {

    public static void main(String[] args){

        //0 1 1 2 3 5 8 13 21...

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i=0; i<8; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }


    }
}
