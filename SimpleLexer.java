import java.util.*;

public class SimpleLexer {

    static final Set<String> keywords = new HashSet<>(Arrays.asList(
        "if", "else", "while", "for", "return", "int", "float", "char", "void"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();

        System.out.println("Enter your code below. Press Ctrl+D (Linux/macOS) or Ctrl+Z then Enter (Windows) to finish:");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            inputBuilder.append(line).append(" ");
        }

        String input = inputBuilder.toString();
        List<String> tokens = Arrays.asList(input.split("\\s+|(?=\\W)|(?<=\\W)"));

        System.out.println("\nKeywords found:");
        for (String token : tokens) {
            if (keywords.contains(token)) {
                System.out.println(token);
            }
        }
    }
}
