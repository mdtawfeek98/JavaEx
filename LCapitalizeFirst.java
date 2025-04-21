public class LCapitalizeFirst {

    public static void main(String[] args) {

        String name = "tawfeek mohamed";
        String str = " " + name;
        String cap = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                cap = cap + ch;
                i++;
                ch = str.charAt(i);
                cap = cap + Character.toUpperCase(ch);
            }
            else {
                cap = cap + ch;
            }
        }

        System.out.println(cap.trim());

    }
}
