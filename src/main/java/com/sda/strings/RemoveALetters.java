package com.sda.strings;

public class RemoveALetters implements StringOperation {
    @Override
    public String modify(String tekst) {

        tekst = tekst.replaceAll("a", "");
        tekst = tekst.replaceAll("A","");

        return tekst;
    }
}
