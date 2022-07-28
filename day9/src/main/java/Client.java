import java.io.*;
import java.net.Socket;

public class Client {


    public static void main(String[] args) {

        final String QUIT = "quit";
        final String DEFAULT_SERVER_HOST = "127.0.0.1";
        final int DEFAULT_SERVER_PORT = 8000;
        Socket socket = null;

        BufferedWriter writer = null;
        BufferedReader reader = null;
        BufferedReader consoleReader = null;

        try {

            socket = new Socket(DEFAULT_SERVER_HOST, DEFAULT_SERVER_PORT);


            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );


            consoleReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String input = consoleReader.readLine();


                writer.write(input + "\n");
                writer.flush();


                String msg = reader.readLine();
                System.out.println(msg);


                if (QUIT.equalsIgnoreCase(input)) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                writer.close();
                socket.close();
                reader.close();
                consoleReader.close();
                System.out.println("关闭socket");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
