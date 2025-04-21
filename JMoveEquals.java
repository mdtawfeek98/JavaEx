public class JMoveEquals {

    public static void main(String[] args) {

        String name = "tAwfeek";

        int vowels = 0;
        int consonants = 0;

        for(int i=0; i<name.length(); i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
                System.out.println("Voewls:"+ch);
            }
            else{
                consonants++;
                System.out.println("Consonats:"+ch);
            }
        }

        System.out.println("Vowels Count:"+vowels);
        System.out.println("Consonants Count:"+consonants);

    }
}
