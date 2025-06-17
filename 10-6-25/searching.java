public class App{
    public static void main(String[] args){
        int[] nums = {10,19,2,3,7,20,8,9};
        int target = 20;
        int index = -1;
        for(int i= 0 ;i<nums.length;i++){
            if(target == nums[i])
            index = i;
        }
        System.out.println(index == -1?"Element not found":"Element found at index " +index);
    }
}