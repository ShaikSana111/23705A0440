public class Application{
    String name;
    String category;
    int downloads;
    String reviews;
    public Application(String name, String category, int downloads,String reviews ){
        this.name = name;
        this.category = category;
        this.downloads = downloads;
        this.reviews = reviews;
    }
    public void is_popular(){
        if(downloads >= 800){
            System.out.println("more popular");
        }else if(downloads<800 || downloads >500){
            System.out.println("Medium popular");
        }else{
            System.out.println("less population");
        }
    }
    public void get_summary(){
        System.out.println("name:" +name);
        System.out.println("category:"+category);
        System.out.println("downloads:"+downloads);
        System.out.println("reviews:"+reviews);
    }
    public static void main(String[] args){
        Application app = new
        Application("Chatgpt","AI searching tool",1000,"no reviews");
        app.is_popular();
        app.get_summary();
    }
}