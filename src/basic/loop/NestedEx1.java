package basic.loop;

public class NestedEx1 {
    public static void main(String[] args) {
        int dan;
        int val;

        for(int i=1; i<=9; i++) {
            dan = i;
            for(int j=1; j<=9; j++) {
                val = dan * j;
                System.out.println(dan + " * " + j + " = " + val);
            }
            System.out.println();
        }
    }
}
