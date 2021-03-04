import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

    private static void moveFile(String src, String dest ) {
        Path result = null;
        try {
            result =  Files.move(Paths.get(src), Paths.get(dest));
        } catch (IOException e) {
            System.out.println("Exception while moving file: " + e.getMessage());
        }
        if(result != null) {
            System.out.println("File moved successfully.");
        }else{
            System.out.println("File movement failed.");
        }
    }

    public static void main(String[] args) {

        moveFile("/home/gleb/IdeaProjects/untitled/src/main/resources/java","/home/gleb/IdeaProjects/untitled/src/main/java");


    }
}
