
import com.sda.strings.TextCensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCensorTest {
    @Test
    public void TextCensorTest() {
        //Given

        TextCensor inst2 = new TextCensor("kota");
        String excepted = inst2.modify("Ala i jej mama i jej tata maja ");
        //When
        String actualmethodresult = inst2.modify("Ala i jej mama i jej tata maja kota");
        //Then
        assertEquals(excepted, actualmethodresult);
    }


}


