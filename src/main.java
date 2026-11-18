
import java.util.HashMap;
import java.util.Map;

    public class main {

        public static void main(String[] args) {
            // Inizializzazione -> new HashMap<>(Map.of(":risata:", "😆"));
            HashMap<String, String> parolaToEmoji = new HashMap<>(Map.of(":risata:", "😆", ":triste:", "😢"));
            printHashMap(parolaToEmoji);
            // Aggiunta
            parolaToEmoji.put(":felice:","😊");
            // Rimozione


            parolaToEmoji.remove(":triste:");
            // Modifica
            parolaToEmoji.put(":felice:","😁");

            // Dimensione
            int grandezza_diz= parolaToEmoji.size();



            printHashMap(parolaToEmoji);
        }

        private static void printHashMap(HashMap<String, String> parolaToEmoji) {
            for (String key : parolaToEmoji.keySet()) {
                // Parte inferiore tagliata nello screenshot
                IO.println(key + " -> " + parolaToEmoji.get(key));
            }
            IO.println("--------");

        }
    }

//CHIEDI ALL'utente una frase e se ci sono le parole da criptare in emoji e noi gliela ridiamo con le emoji

