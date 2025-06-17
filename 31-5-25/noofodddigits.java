class Main {
    public static void main(String[] args) {
        int num = 4525;
        int count = 0;
        while(num > 0){
            int lastdigit = num %10;
            if(lastdigit % 2 != 0){
                 count = count+1;
            }
          num = num/ 10;
        }
        System.out.println("number of odd digits are:" + count);
        
    }
}