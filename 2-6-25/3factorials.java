class Main {
    public static void main(String[] args) {
       int n = 9;
       int count = 0;
       for(int i =1; i<=n;i++){
           if(n% i == 0){
               count ++;
           }
       }
       if (count == 3){
           System.out.println("Exactly have 3 factorials ");
       }else{
           System.out.println("do not have 3 factorial");
       }
    }
}