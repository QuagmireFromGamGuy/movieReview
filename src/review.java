import java.util.*;

public class review{
        private String username;
        private String movieName;
        private double score;
        private String reviewWrite = "";
        private String reviewToString;
        public review(String user, String moviename, double inpscore, String inpreview){
            username = user;
            movieName = moviename;
            score = inpscore;
            reviewWrite = inpreview;

        }
        public review(String user,String moviename, double inpscore){
            username = user;
            movieName = moviename;
            score = inpscore;
            

        }
        public String getReview(){
            return this.reviewWrite;
        }
        public String reviewtoString(){
            reviewToString = "";
            if(this.getReview() == null){
                 reviewToString = movieName + " " + String.valueOf(score);
            } else
            reviewToString = movieName + " " + String.valueOf(score) + " " + this.getReview() + "|||";
            
           
            
            return reviewToString;
        
        }
        
}