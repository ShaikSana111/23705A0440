class Main {
    public static void main(String[] args) {
       int num = 4521;
       int temp = num;
       int rev = 0;
       while(temp >0){
           int digit = temp %10;
           rev=(rev*10)+digit;
           temp = temp/10;
       }
       System.out.println("reverse of "+ num +" is "+rev);
    }
}