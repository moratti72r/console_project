import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static final String PATH_TEXT_FILE = "src\\main\\resources\\";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        FileManager fileManager = new FileManager(PATH_TEXT_FILE + scanner.next());

        for (String result : fileManager.firstThreeWords()) {
            System.out.println(result);
        }

    }
}
