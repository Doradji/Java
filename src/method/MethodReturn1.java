package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = ood(2);
        System.out.println(result);
    }

    public static boolean ood(int i) {
        if (i % 2 == 1) {
            return true;
        }else {
            return false;
        }
    }

}
