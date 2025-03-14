package mid.exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException { // 발생시킨 예외를 메서드 밖으로 던짐
        throw new MyCheckedException("ex"); // 예외 발생
    }
}
