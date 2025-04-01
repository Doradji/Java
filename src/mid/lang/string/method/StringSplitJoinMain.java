package mid.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split() : 문자열을 정규 표현식을 기준으로 분할한다.
        String[] splitStr = str.split(",");
        for(String s : splitStr){
            System.out.println(s);
        }

        // join() : 주어진 구분자로 여러 분자열을 결합한다.
        String joinedStr = String.join("-", "A","B","C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
