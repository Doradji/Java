package basic.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int numCount = scanner.nextInt();
        int[] arr = new int[numCount];

        System.out.println(numCount+"개의 정수를 입력하세요:");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double) sum / arr.length);


    }
}
