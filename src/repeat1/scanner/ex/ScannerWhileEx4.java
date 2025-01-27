package repeat1.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            switch (option){
                case 1 :
                    System.out.print("상품명을 입력하세요:");
                    String productName = input.next();

                    System.out.print("상품의 가격을 입력하세요:");
                    int price = input.nextInt();

                    System.out.print("구매 수량을 입력하세요:");
                    int quantity = input.nextInt();

                    sum += price * quantity;
                    System.out.println("상품명: " + productName + ", 가격: " + price + ", 수량:" + quantity + ", 총 비용: " + price * quantity);
                    break;
                case 2 :
                    System.out.println("총 비용:" + sum);
                    break;
                case 3:
                    System.out.print("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.print("잘못된 입력입니다.");
            }

            if(option == 3){
                break;
            }
        }

    }
}
