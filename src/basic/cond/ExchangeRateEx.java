package basic.cond;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 10;

       if(dollar < 0){
           System.out.println("잘못된 금액입니다.");
       }else if (dollar == 0) {
           System.out.println("환전할 금액이 없습니다.");
       }else if (dollar > 0) {
           int exchange = dollar * 1300;
           System.out.println("환전 금액은" + exchange +"원 입니다.");
       }

    }
}
