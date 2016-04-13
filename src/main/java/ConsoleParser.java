import java.io.*;
import java.util.List;

public class ConsoleParser {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BraceParser braceParser = new BraceParser(new StringReader(line));
        List<String> values = braceParser.parse();
        String output = values.stream().reduce((x, y) -> x  + ", " + y).get();
        System.out.println("output = " + "{" + output + "}");
    }
}
