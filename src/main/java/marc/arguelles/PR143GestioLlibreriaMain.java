package marc.arguelles;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PR143GestioLlibreriaMain {
    public static void main(String[] args) throws IOException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            List<Llibre> llibres = objectMapper.readValue(new File("data/llibres_input.json"),
                    new TypeReference<List<Llibre>>() {
                    });

            for (Llibre llibre : llibres) {
                if (llibre.getId() == 1) {
                    llibre.setAny(1995);
                }
            }
            llibres.add(new Llibre(4, "Històries de la ciutat", "Miquel Soler", 2022));

            Llibre borrarLlibre = null;
            for (Llibre llibre : llibres) {
                if (llibre.getId() == 2) {
                    borrarLlibre = llibre;
                }
            }

            llibres.remove(borrarLlibre);
            objectMapper.writeValue(new File("data/llibres_output.json"), llibres);

        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
