import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BraceParserTest {

    @Test
    public void testBraceParser() {
        List<String> values = new ArrayList<>();
        values.add("{}");
        values.add("{}(){(})))((");
        values.add("{}}");
        assertTrue(BraceValidator.parse(values.get(0)));
        assertTrue(BraceValidator.parse(values.get(1)));
        assertFalse(BraceValidator.parse(values.get(2)));
    }
}
