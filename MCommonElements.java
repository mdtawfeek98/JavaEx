import java.util.ArrayList;
import java.util.List;

public class MCommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,98,99,100};
        int[] arr2 = {5,90,99,100};

        List<Integer> li = new ArrayList<>();

        for (int i=0; i<arr1.length;i++){
            for (int j=0; j< arr1.length; j++){
                if(arr1[i] == arr2[j]){
                    li.add(arr1[i]);
                }
            }
        }

        for (int ss : li){
            System.out.println(ss);
        }
    }
}
