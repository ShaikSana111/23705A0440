public class Freq_of_element{
    public static void main(String[] args){
        int[] arr={1,2,3,3,3,4,3,6,2,8};
        int n= 3;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n) count = count+1 ;
            
        }
        System.out.println("Frequency of element:" +count);
    }
} 