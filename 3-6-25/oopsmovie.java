public class Movie{
      String name;
      int rating;
      String duration;
      public Movie(String name,int rating,String duration){
          this.name = name;
          this.rating = rating;
          this.duration = duration;
      }
      public boolean is_hit(){
          if(rating>8){
              return true;
          }else{
              return false;
          }
      }
      public void details(){
              System.out.println("Name of the movie :" + name);
              System.out.println("Rating out of 10 :" + rating);
              System.out.println("Movie duration :"+ duration);
              System.out.println("Is Movie hit:" + is_hit());
      }
      public static void main(String[] args){
          Movie cinema = new Movie("Court",9,"02h:40m");
          cinema.details();
      }

}
