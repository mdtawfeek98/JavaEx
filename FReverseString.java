public class FReverseString {

    public static void reverString(){
        String reversePartial = "Tawfeek";
        String rev = "";

        for (int i=reversePartial.length()-1 ; i>=0 ; i--){
            char ch = reversePartial.charAt(i);
            rev = rev + ch;
        }

        System.out.println(rev);
    }

    public static void reverseWord(){
        String name = "Mohamed Tawfeek";
        String[] nn = name.split(" ");

        for(String ss : nn){
            String reverseWord = "";
            for (int i=ss.length()-1; i>=0; i--){
                char ch = ss.charAt(i);
                reverseWord = reverseWord + ch;
            }
            System.out.print(reverseWord + " ");
        }
    }

    public static void main(String[] args) {

       // FReverseString.reverString();
        FReverseString.reverseWord();

    }
}
