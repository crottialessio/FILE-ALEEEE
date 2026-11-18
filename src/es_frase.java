import java.util.HashMap;
import java.util.Map;
public class es_frase {
    public static void main(String[] args) {
        // Inizializzazione -> new HashMap<>(Map.of(":risata:", "😆"));

            HashMap<String, String> parolaToEmoji = new HashMap<>(Map.of(":risata:", "😆", ":triste:", "😢"));
        String frase=IO.readln("INSERISCI UNA FRASE");
        String [] parole=frase.split(" ");
        for (String par_sing:parole){

                // Parte inferiore tagliata nello screenshot
                if (parolaToEmoji.containsKey(par_sing)){

                    par_sing=parolaToEmoji.get(par_sing);


                }

            IO.print(par_sing+" ");
        }






        }
    }


