package mid.lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        UserV2 user = (UserV2) obj; // Object 타입을 매개변수로 사용하여 다운캐스팅

        // this에 있는 id 문자열과 비교대상으로 넘어온 객체의 id 문자열을 비교
        // 문자열 비교는 == 아니라 equals() 사용
        return id.equals(user.id); 
    }
}
