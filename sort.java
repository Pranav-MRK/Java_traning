public class sort {
    public static void main(String args[]){
        int[] arr= {2,7,3,5,4,9};
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
