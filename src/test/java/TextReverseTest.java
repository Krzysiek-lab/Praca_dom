import com.sda.strings.TextReverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextReverseTest {
    @Test
    public void TextDotsTest() {
        //Given

        TextReverse inst2 = new TextReverse();
        String excepted = "seiP";
        //When
        String actualmethodresult = inst2.modify("Pies");
        //Then
        assertEquals(excepted, actualmethodresult);
    }
}
