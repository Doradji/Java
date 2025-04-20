package mid.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }


    // 열거형은 toString()을 재정의 하여 참조값을 직저 확인 불가
    private static String refValue(Object grade) {
        // 순사를 16진수로 변환 (자바가 관리하는 객체의 참조값을 숫자로 반환)
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
