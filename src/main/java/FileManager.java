import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private String path;

    public FileManager(String path) {
        this.path = path;
    }

    public ArrayList<String> firstThreeWords() throws FileNotFoundException {
        ArrayList<String> allText = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.ready()) {
                String line = br.readLine();
                allText.add(line);
            }
            if (allText.size() > 0) {
                for (String text : allText) {
                    String[] words = text.split(" ");
                    if (words.length > 2) {
                        result.add(words[0] + " " + words[1] + " " + words[2]);
                    }
                }
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
