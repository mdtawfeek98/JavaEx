public class HStringCompression {

    public static void main(String[] args) {

        String str = "aabccc";
        String ss = "";
        int count = 1;

        for (int i=0; i<str.length(); i++){
            if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else {
                ss = ss + str.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println(ss);
    }
}
