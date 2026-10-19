
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur2 {

    public static void main(String[] args) {
        final int port = 2000;

        try (ServerSocket serveur = new ServerSocket(port)) {
            System.out.println(
                "Le serveur est pret a recevoir des requetes sur le port " + port
            );

            int nbrclient = 1;

            while (true) {
                Socket socket = serveur.accept();

                System.out.println(
                    "Le client numero " + nbrclient + " est connecte !"
                );

                try (Socket client = socket;
                     PrintWriter out = new PrintWriter(
                         client.getOutputStream(), true
                     )) {

                    out.println("Vous etes le client numero " + nbrclient);
                }

                nbrclient++;
            }

        } catch (IOException e) {
            System.err.println("Erreur serveur : " + e.getMessage());
        }
    }
}
