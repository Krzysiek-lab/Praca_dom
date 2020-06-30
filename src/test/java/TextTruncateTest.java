import com.sda.strings.TextTruncate;
import com.sda.strings.Textdots;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTruncateTest {
    @Test
    public void TextDotsTest() {
        //Given

        TextTruncate inst2 = new TextTruncate(5);
        String excepted = inst2.modify("Ala i");
        //When
        String actualmethodresult = inst2.modify("Ala i jej mama i jej tata maja kota");
        //Then
        assertEquals(excepted, actualmethodresult);
    }
}
