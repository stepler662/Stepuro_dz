package network_storage_development_in_java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

private final int port;
private ServerSocket serverSocket;
private boolean isStopped;

public Server(int port) {
    this.port = port;
}

@Override
public void run(){
    Socket socket;

    openServerSocket();
    System.out.println("Server started");

    while (!isStopped) {
        try {
            socket = serverSocket.accept();
        } catch (IOException e){
            if (isStopped){
                System.out.println("Server stopped");
                return;
            }
            throw new RuntimeException(e);
        }
    }

}

private void openServerSocket(){
    try{
        serverSocket = new ServerSocket(port);

    } catch (IOException e){
        throw new RuntimeException("Cannot  open server socket !");
    }
}

private void process (Socket socket) throws IOException {
    InputStream inputStream = socket.getInputStream();
    OutputStream outputStream = socket.getOutputStream();


    int size = inputStream.readInt();
    byte[] data = new byte[size];
    inputStream.readFully(data);

    System.out.println("Received: " + new );
}
}
