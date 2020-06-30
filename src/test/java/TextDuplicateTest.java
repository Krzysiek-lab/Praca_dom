import com.sda.strings.TextDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextDuplicateTest {
    @Test
    public void TextDotsTest() {
        //Given

        TextDuplicate inst2 = new TextDuplicate();
        String excepted = "AlaAla";
        //When
        String actualmethodresult = inst2.modify("Ala");
        //Then
        assertEquals(excepted, actualmethodresult);
    }
}