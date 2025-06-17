class Main {
    public static void main(String[] args) {
        int[] nums = {25,705,114,125};
        int max = nums[0];
        for( int i = 1; i < nums.length ;i++){
            int value = nums[i];
            if(value > max){
             max = value;    
            }
           
        }
        System.out.println("max element in an array :" + max);
    }
}