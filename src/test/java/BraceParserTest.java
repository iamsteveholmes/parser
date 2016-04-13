import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BraceParserTest {

    @Test
    public void testBraceParser() {
        StringReader stringReader = new StringReader("(()) {{} []");
        BraceParser braceParser = new BraceParser(stringReader);

        List<String> values = braceParser.parse();
        assertEquals("true", values.get(0));
        assertEquals("false", values.get(1));
        assertEquals("true", values.get(2));
    }
}
