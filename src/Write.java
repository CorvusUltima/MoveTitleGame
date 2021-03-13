import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Write {

    private String fileName;
    private boolean append_to_file = false;


    public Write(String fileName) {
        this.fileName = fileName;
    }// constructor with false append ,automatically rewrites text file ;


    public Write(String fileName, boolean append_to_file) // append=add to existing file or replace with new file ;
    {
        this.fileName = fileName;
        this.append_to_file = append_to_file;
    }


    public void WriteToFile(String textLine) throws IOException {


        FileWriter write = new FileWriter(fileName, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        print_line.printf("%s" + "%n", textLine);
        print_line.close();


    }// Method allowing us to read a text file ;

    public void ReadFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        String text = new String();
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i

            );
    }



   static String  GetNextText(String file,String readAfterThis,String readUntilThis,int occurrence)
   {

       String out="";
       int startingPosition =0;

       do{
           startingPosition = file.indexOf(readAfterThis, startingPosition)+ readAfterThis.length();
       }while(--occurrence > 0);
       int endingPosition = file.indexOf(readUntilThis, startingPosition);
       if(endingPosition < 0) endingPosition = file.length();
       out = file.substring(startingPosition ,endingPosition);
       out = out. trim();
       return out;
   }







}
