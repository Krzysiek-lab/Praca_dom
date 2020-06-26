package com.sda.strings;

public class RemoveALetters implements StringOperation {
    @Override
    public String modify(String tekst) {
        tekst = tekst.replace('a', (char) 255);
        tekst = tekst.replace('A', (char) 255);
        return tekst;
    }
}
