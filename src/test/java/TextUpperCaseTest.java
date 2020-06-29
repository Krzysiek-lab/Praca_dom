import com.sda.strings.TextUpperCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextUpperCaseTest {
    @Test
    public void TextIpperCaseTest() {
        //Given

        TextUpperCase inst2 = new TextUpperCase();
        String excepted = inst2.modify("ALA");
        //When
        String actualmethodresult = inst2.modify("Ala");
        //Then
        assertEquals(excepted, actualmethodresult);
    }
}
