package study.week05.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();

    }

    // 소켓을 대기하는 서버
    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            // 포트번호 9999를 이용하여 ServerSocket객체를 생성한다.
            server = new ServerSocket(9999);
            while (true) {
                System.out.println("Server:Waiting for request.");
                // serverSocket 클래스에 선언되어 있는 accept()메소드를 호출하면 다른 원격 호출을 대기하는 상태가 된다. 연결이 완료되면 "Socket 객체를 리턴"하여 client라는 변수에 할당
                client = server.accept();
                System.out.println("Server:Accepted");
                // 데이터를 받기 위해선 Socket 클래스에 선언된 getIntputStream() 메소드를 호출하여 InputStream객체에 받았다.
                // 만약 접속한 상대방에게 데이터를 전송하려면 getOutputStream() 메소드를 로출하여 outputStream 객체를 받은 후 이 stream에 데이터를 전달하면 된다.
                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(stream)
                );
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received Date : " + receivedData);

                in.close();
                stream.close();
                // 모든 데이터 처리가 끝난 후 Socket사용이 종료되었다는 것을 알리기 위해 close() 메소드를 호출
                client.close();
                if (receivedData != null && "EXIT".equals(receivedData.toString())) {
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("-------------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    // 더 이상 소켓 수신할 필요가 없을 때에는 이와 같이 ServerSocket의 close() 메소드를 호출하면 된다.
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
