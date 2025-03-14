package mid.exception.ex0;

// NetworkClient 를 사용해서 데이터를 전송한다
public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
