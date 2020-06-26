package com.sda.strings;

public class TextReverse implements StringOperation {

    @Override
    public String modify(String tekst) {
        char[] tab = new char[tekst.length()];
        for (int i = 0; i < tekst.length(); i++) {
            tab[i] = tekst.charAt(tekst.length()-(i+1));
        }
        tekst = new String(tab);
        return tekst;
    }
}