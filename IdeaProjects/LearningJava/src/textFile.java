import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class textFile {
    public static void main(String[] args) throws IOException {
        Path file = FileSystems.getDefault().getPath("/Users/JoshuaPita/IdeaProjects/LearningJava/src/file", "file.txt");
        List<String> lines = Files.readAllLines(file);

        for(int i = 0; i < lines.size(); i++){
            System.out.println(lines.get(i));

        }
    }
}
