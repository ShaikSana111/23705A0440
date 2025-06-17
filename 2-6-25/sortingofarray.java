public class Sorted_or_not{
    public static void main(String[] args){
        int[] arr ={1,2,3,6,4,5};
        boolean ascending = ascending(arr);
        boolean descending = descending(arr);
        comparision(descending,ascending);
} 
static boolean ascending(int arr[]){
    int flag = 0;
    for(int i=0; i<arr.length-1 ; i++){
        if(arr[i]>arr[i+1]){
            flag = 1;
            break;
        }
    }
    if(flag == 0){
        return true;
    }
    return false;
}
static boolean descending(int arr[]){
    int flag = 0;
    for(int i = 0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            flag = 1;
            break;
        }
    }
    if(flag == 0){
        return true;
    }
    return false;
    }
    static void comparision(boolean descending,boolean ascending){
        if(descending||ascending){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }