package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;
        String scoreType;

       if(score >= 90){
        scoreType = "A";
       } else if (score >= 80 && score < 90) {
           scoreType = "B";
       }else if (score >= 70 && score < 80) {
           scoreType = "C";
       }else if (score >= 60 && score < 70) {
           scoreType = "D";
       }else {
           scoreType = "F";
       }

        System.out.println("학점은 " + scoreType+"입니다.");
    }
}
