import com.sda.strings.Textdots;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextDotsTest {
    @Test
    public void TextDotsTest() {
        //Given

        Textdots inst2 = new Textdots("kota");
        String excepted = inst2.modify("Ala i jej mama i jej tata maja ****");
        //When
        String actualmethodresult = inst2.modify("Ala i jej mama i jej tata maja kota");
        //Then
        assertEquals(excepted, actualmethodresult);
    }
}
