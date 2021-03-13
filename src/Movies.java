import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Movies {

   String name;
   int nHintCurent=0;

   String[] hints=new String[5];




    void SetAMovie() throws IOException {

        // Text file jamming ->String
        String content = Files.readString(Path.of("src/Movies.txt"), StandardCharsets.US_ASCII);
        int randomMovie = rng.rdm_int(0,5);


        name = Write.GetNextText(content, " NAME:", "HINT 1", randomMovie);
        hints[0] = Write.GetNextText(content, "HINT 1", "HINT 2", randomMovie);
        hints[1] = Write.GetNextText(content, "HINT 2", "HINT 3", randomMovie);
        hints[2] = Write.GetNextText(content, "HINT 3", "HINT 4", randomMovie);
        hints[3] = Write.GetNextText(content, "HINT 4", "HINT 5", randomMovie);
        hints[4] = Write.GetNextText(content, "HINT 5", "NAME:", randomMovie);


    }


}
