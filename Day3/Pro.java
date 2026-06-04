package Day3;

public class Pro {
    public boolean Odd_even(int i){
        if(i%2==0){
            return true; 
        }else{
            return false;
        }
    }
    public int find_No(int nums[],int k){
        for(int i=0;i<nums.length;i++){
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public int Sum(int i,int j){
        return i+j;
    }
}
