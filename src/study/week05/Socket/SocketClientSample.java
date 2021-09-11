package study.week05.Socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {

    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    private void sendSocketSample() {
        for (int i = 0; i < 3; i++) {
            sendSocketDate("난 자바를 좋아해,,"+new Date());
        }
        sendSocketDate("EXIT");
    }

    private void sendSocketDate(String data) {
        Socket socket = null;
        System.out.println("Client : Connecting...");
        try {
            // 127.0.0.1이라는 IP는 장비같은 것을 의미한다. 그리고 포트 번호는 서버쪽에 지정한 포트와 동일해야만 한다.
            // 이 두개의 매개변수를 갖는 Socket생성자를 사용하여 객체를 생성하고, 접속을 하였다.
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("Client : Connect status : "+socket.isConnected());
            Thread.sleep(1000);
            // 데이터를 서버에 전달하기 위해서 getOutputStream() 메소드를 사용하여 객체를 생성
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client : send data."+new Date());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    // 데이터를 전달한 후 close() 메소드를 통해 소켓 연결을 닫는다.
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
