public class RCharacterMultiples {

    public static void main(String[] args) {

        String name = "abbbccc";
        String nn = "";

        for(int i=0; i<name.length();i++){
            for (int j = i+1; j<name.length(); j++){
                if(name.charAt(i) == name.charAt(j)){
                    if (!nn.contains(String.valueOf(name.charAt(i)))) {
                        nn = nn + name.charAt(i);
                    }
                }
            }
        }
        System.out.println(nn);
    }
}
