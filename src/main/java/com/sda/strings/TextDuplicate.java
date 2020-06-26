package com.sda.strings;

public class TextDuplicate implements StringOperation {
    @Override
    public String modify(String tekst) {

        return tekst.repeat(2);
    }

}
