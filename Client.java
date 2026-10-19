import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 2000);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            )
        ) {
            String message = in.readLine();
            System.out.println("Message du serveur : " + message);

        } catch (Exception e) {
            System.err.println("Erreur client : " + e.getMessage());
        }
    }
}   

