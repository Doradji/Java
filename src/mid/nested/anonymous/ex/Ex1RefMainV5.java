package mid.nested.anonymous.ex;

// 람다 사용
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조작 시작
        process.run();
        // 코드 조작 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(() -> {
            int randomValue = new java.util.Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.print(i + " ");
            }
        });
    }
}
