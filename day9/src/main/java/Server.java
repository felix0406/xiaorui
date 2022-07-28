
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

    public class Server {

        public static void main(String[] args) {

            final String QUIT = "quit";
            final int DEFAULT_PORT = 8000;
            ServerSocket serverSocket = null;
            BufferedReader reader = null;
            BufferedWriter writer = null;

            try {
                // 绑定监听端口
                serverSocket = new ServerSocket(DEFAULT_PORT);
                System.out.println("启动服务器，监听服务器本地端口" + DEFAULT_PORT);

                while (true) {

                    Socket socket = serverSocket.accept();
                    System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]已连接");

                    reader = new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );

                    writer = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())
                    );

                    String msg = null;
                    while ((msg = reader.readLine()) != null) {

                        System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]: " + msg);


                        writer.write("服务器已收到: " + msg + "\n");

                        writer.flush();


                        if (QUIT.equalsIgnoreCase(msg)) {
                            System.out.println("客户端["+socket.getInetAddress()+":"+ socket.getPort() + "]已断开连接");
                            break;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    serverSocket.close();
                    reader.close();
                    writer.close();
                    System.out.println("关闭serverSocket");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }



