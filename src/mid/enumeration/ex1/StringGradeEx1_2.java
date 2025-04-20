package mid.enumeration.ex1;


import mid.enumeration.ex0.DiscountServie;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountServie discountServie = new DiscountServie();

        // 존재하지 않는 등급
        int vip = discountServie.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamond = discountServie.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamond);

        // 소문자 입력
        int gold = discountServie.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
