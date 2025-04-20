public class NPalindrome {

    public static void main(String[] args) {

        String name = "ALAA";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            rev = rev + ch;
        }

        if(name.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No Palindrome");
        }

    }
}
