public class Teacher{
    String name ;
    String id;
    String [] subjects;
    String dept;
    String qualification;
    
    Teacher(String name,String id , String dept,String qualification,String [] subjects){
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.subjects = subjects;
    }
    void details(){
        System.out.println("---------------------");
        System.out.println("Teacher name:" + name);
        System.out.println("Teacher id :" + id);
        System.out.println("Teacher dept:" + dept);
        System.out.println("Teacher qualification:" + qualification);
        System.out.println("subjects:");
        for(String subject: subjects){
            System.out.println(subject +",");
        }
        System.out.println();
        System.out.println("-----------------");
   }
        

    public static void main(String[] args){
        Teacher t1= new Teacher("S.Thaharunnisa","23705ABE67","ECE","M.Tech",new String[]{"C","Java","Python"});
        t1.details();
    }
}