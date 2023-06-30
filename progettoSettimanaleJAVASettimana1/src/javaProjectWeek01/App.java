package javaProjectWeek01;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
   
       
        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il titolo dell'elemento multimediale: ");
            String titolo = scanner.nextLine();

            System.out.print("Inserisci il tipo di elemento (1 = Registrazione Audio, 2 = Video, 3 = Immagine): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            if (tipo == 1) {
            	System.out.print("Inserisci il volume della registrazione audio: ");
                int volume = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Inserisci la durata della registrazione audio: ");
                int durata = scanner.nextInt();
                scanner.nextLine(); 

                elementi[i] = new RegistrazioneAudio(titolo, volume, durata, 0);
            } else if (tipo == 2) {
                System.out.print("Inserisci il volume del video: ");
                int volume = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Inserisci la luminosità del video: ");
                int luminosità = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Inserisci la durata del video: ");
                int durata = scanner.nextInt();
                scanner.nextLine(); 

                elementi[i] = new Video(titolo, volume, durata, luminosità);
            } else if (tipo == 3) {
                System.out.print("Inserisci la luminosità dell'immagine: ");
                int luminosità = scanner.nextInt();
                scanner.nextLine(); 

                elementi[i] = new Immagine(titolo, luminosità);
            }
        }

        int scelta;
        do {
            System.out.println("Scegli l'elemento da eseguire (1-5) o 0 per terminare: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); 

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof RegistrazioneAudio) {
                    RegistrazioneAudio registrazioneAudio = (RegistrazioneAudio) elemento;
                    registrazioneAudio.play();
         
                } else if (elemento instanceof Video) {
                    Video video = (Video) elemento;
                    video.play();
             
                } else if (elemento instanceof Immagine) {
                    Immagine immagine = (Immagine) elemento;
                    immagine.show();
                    
                }
            }
        } while (scelta != 0);

        scanner.close();
    }
}