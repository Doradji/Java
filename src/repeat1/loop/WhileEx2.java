package repeat1.loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while(count < 10){
            if(i %2 == 0){
                count++;
                System.out.println(i);
            }
            i++;
        }
    }
}
