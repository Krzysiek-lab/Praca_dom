import com.sda.strings.RemoveALetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveAletters {
    @Test
    public void RemoveAllLettersTest() {
        //Given
        String tekst = "Ala ma kota";
        String excepted = "l m kot";
        RemoveALetters inst = new RemoveALetters();
        //When
        String actualresult = inst.modify(tekst);
        //Then
        assertEquals(excepted, actualresult);
    }


}
