public class EFizzBuzz {

    public static void main(String[] args) {

        for(int i=1; i<=15; i++){

            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz");
            } else if (i%3==0) {
                System.out.println("FIzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
