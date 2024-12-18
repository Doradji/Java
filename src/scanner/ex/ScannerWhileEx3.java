package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("입력한 숫자의 총 합: " + sum);
        System.out.println("입력한 숫자의 평균: " + (double) sum / count);
    }
}
