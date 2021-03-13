import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Movies {

   String name;
   int nHintCurent=0;

   String[] hints=new String[5];




    void SetAMovie() throws IOException {

        // Text file jamming ->String
        String content = Files.readString(Path.of("src/Movies.txt"), StandardCharsets.US_ASCII);
        int nMovie = 0;
        Pattern p = Pattern.compile("NAME");
        Matcher m = p.matcher(content );
        while (m.find()) {
            nMovie++;
        }
        System.out.print(nMovie);
        int randomMovie = rng.rdm_int(1,nMovie);


        name = Write.GetNextText(content, " NAME:", ";", randomMovie);

        for (int i = 0; i < 5; ++i) {
            String startPos=("HINT "+(i+1)+ ':');
            hints[i] = Write.GetNextText(content, startPos, ";", randomMovie); ;
        }



    }


}
