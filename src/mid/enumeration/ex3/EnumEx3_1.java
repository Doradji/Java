package mid.enumeration.ex3;


import mid.enumeration.ex3.DiscountService;

public class EnumEx3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountServie = new DiscountService();

        int basic = discountServie.discount(Grade.BASIC, price);
        int gold = discountServie.discount(Grade.GOLD, price);
        int diamond = discountServie.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
