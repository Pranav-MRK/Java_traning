package Day3;

public class Test1 {
    public static void main(String args[]){
        // int arr1[] = {1,2,3,4,5};
        // int arr2[] ={6,7,8,9};
        // int s3= arr1.length+arr2.length;

        // int[] arr3 = new int[s3];

        // int i=0;

        // for (i = 0; i < arr1.length; i++) {
        //     arr3[i] = arr1[i];
        // }
        // for (int j = 0; j < arr2.length; j++) {
        //     arr3[i] = arr2[j];
        //     i++;
        // }


        // for (int j = 0; j < arr3.length; j++) {
        //     System.out.print(arr3[j]);
        // }

        String[] t1 = {"Aj","Vj","Pk","RK"};
        String[] t2 = {"pj","lj","Sk","MK"};

        int s = t1.length+t2.length;

        String[] t3 = new String[s];

        int i=0;
        for (i = 0; i < t1.length; i++) {
            t3[i] = t1[i];
        }
        for (int j = 0; j < t2.length; j++){
            t3[i] = t2[j];
            i++;
            
        }
        for (int j = 0; j < t3.length; j++) {
            System.out.println();
        }



    }
}
