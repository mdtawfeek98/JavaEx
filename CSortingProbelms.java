public class CSortingProbelms {

    public static void main(String[] args) {

        int[] arr = {4, 9, 0, 2, 1};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){   //4>0
                    temp = arr[i];     //4
                    arr[i] = arr[j];   //0
                    arr[j] = temp;     //4
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
