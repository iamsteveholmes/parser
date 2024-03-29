import java.util.HashMap;
import java.util.Map;

final class BraceValidator {

    static boolean parse(String value) {
        final Map<Character, Integer> braces = new HashMap<>();
        braces.put('{', 0);
        braces.put('}', 0);
        braces.put('(', 0);
        braces.put(')', 0);
        braces.put('[', 0);
        braces.put(']', 0);

        char[] characters = value.toCharArray();

        for (char character : characters) {
            if (braces.containsKey(character)) {
                final int count = braces.get(character);
                braces.put(character, count + 1);
            } else {
                braces.put(character, 1);
            }
        }

        return braces.get('{').equals(braces.get('}'))
                && braces.get('(').equals(braces.get(')'))
                && braces.get('[').equals(braces.get(']'));
    }
}
