public class Game{
    String title;
    float rating;
    String genre;
    int playcount;
    public Game(String title,String genre,int playcount, float rating){
        this.title = title;
        this.genre = genre;
        this.playcount = playcount;
        this.rating = rating;
    }
    public void Displayinfo(){
        System.out.println("------Information about game------");
        System.out.println("Titlt of the game:" + title);
        System.out.println("Playcount :" +playcount);
        System.out.println("genre :" +genre);
        System.out.println("rating for game:"+ rating);
    }
    public boolean isFamilyFriendly(){
        if(genre == "horror"){
            return false;
        }
        return  true;
    }
    public void playcount(){
       System.out.println("Game is running.....");
       playcount++;
    }
    public void summary(){
        System.out.println("-----Summary of Game----");
        System.out.println("Game title :"+title);
        System.out.println("Genre:"+genre);
        System.out.println("Playcount :" +playcount);
        System.out.println("rating for game:"+ rating);
        System.out.println("Is the game family friendly:"+ isFamilyFriendly());
    }
    public static void main(String[] args){
        Game Game_info = new Game("Chess","mind game",20,8.74f);
        Game_info.Displayinfo();
        Game_info.playcount();
        Game_info.summary();
    }
}