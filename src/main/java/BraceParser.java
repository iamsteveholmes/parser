import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BraceParser {

    private final Scanner scanner;

    BraceParser(StringReader stringReader) {
        scanner = new Scanner(stringReader);
    }

    BraceParser(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    List<String> parse() {
        List<String> values = new ArrayList<>();
        while(scanner.hasNext()) {
            String value = scanner.next();
            values.add(BraceValidator.parse(value) ? "true" : "false");
        }
        return values;
    }
}
