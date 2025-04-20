public class GMoveZeros {

    public static void main(String[] args) {

        String num = "10101010";
        String a1 = "";
        String a2 = "";

        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            if(ch == '1'){
                a1 = a1 + ch;
            }
            else{
                a2 = a2 + ch;
            }
        }

        System.out.println(a2+a1);

    }
}
