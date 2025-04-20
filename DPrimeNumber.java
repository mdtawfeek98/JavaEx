public class DPrimeNumber {

    public static void main(String[] args){

        //1 3 5 7 11 13..

       int n = 11;
       int count = 0;

       for(int i=2; i<n; i++){
           if(n%i==0){
               count++;
           }
       }

       if(count == 0){
           System.out.println("Prime Number");
       }
       else {
           System.out.println("No Prime Number");
       }

    }
}
