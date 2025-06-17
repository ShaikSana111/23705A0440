class Main {
    public static void main(String[] args) {
       int num = 42524;
       int temp = num;
       int rev = 0;
       while(temp >0){
           int digit = temp %10;
           rev=(rev*10)+digit;
           temp = temp/10;
       }
       if(num == rev){
          System.out.println("Palindrome Number");
       }else{
          System.out.println("Not a Palindrome Number"); 
       }
    }
}