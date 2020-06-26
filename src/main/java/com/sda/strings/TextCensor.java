package com.sda.strings;

public class TextCensor implements StringOperation {
    String[] forbiddenwords;

    public TextCensor(String... forbiddenwords) {
        this.forbiddenwords = forbiddenwords;

    }


    @Override
    public String modify(String tekst) {
        for (String nowy : forbiddenwords) {
            if (tekst.contains(nowy)) {
                tekst = tekst.replaceAll(nowy, "");
            }
        }
        return tekst;
    }
}
