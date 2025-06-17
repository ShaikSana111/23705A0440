public class student{
    String name ="Sana";
    String roll ="23705a0440";
    String branch ="ECE";
    byte year = 3;
    char section ='D';
    
    void payfee(int amount){
        System.out.println("paidfee " + amount+" to the clg");
    }
    int attendance(){
        System.out.println("sending the attendence to the student");
        return 30;
    }


  public static void main(String[] args){
    student s1 = new student();
    System.out.println(s1.name);
    System.out.println(s1.roll);
    System.out.println(s1.attendance());
    s1.payfee(100000);
  }    
}
