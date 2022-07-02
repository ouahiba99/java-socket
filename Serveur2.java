import java.io.IOException;
import java.net.*;
import java.io.PrintWriter;

public class Serveur2 {

	public static void main(String[] args){
		
		ServerSocket serveur;
		try {
			serveur = new ServerSocket(2000);
			Thread t = new Thread(new Traitement_requetes(serveur));
			t.start();
			
			
			System.out.println("Le serveur est pret a recevoir des requetes ...");
		} catch (IOException e) { e.printStackTrace(); }
	}
	
}

class Traitement_requetes implements Runnable {

	private ServerSocket serveur;
	private Socket socket;
	private int nbrclient = 1;
	private PrintWriter out;
	
	public Traitement_requetes(ServerSocket s){
		serveur = s;
	}
			
	public void run() {
		try {
			while(true){
				socket = serveur.accept(); // Attente de la connexion d'un client et acceptation
				System.out.println("Le client numero " + nbrclient + " est connecte !");
				out = new PrintWriter(socket.getOutputStream());
				out.println("Vous etes le client numero " + nbrclient);
				out.flush();
				nbrclient++;
				socket.close();
	        }
	    } catch (IOException e) { e.printStackTrace(); }
	}

}