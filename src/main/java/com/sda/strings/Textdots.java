package com.sda.strings;

public class Textdots implements StringOperation {
    String[] forbiddenwords;

    public Textdots(String... forbiddenwords) {
        this.forbiddenwords = forbiddenwords;

    }

    @Override
    public String modify(String tekst) {
        for (String nowy : forbiddenwords) {
            if (tekst.contains(nowy)) {
                int length = nowy.length();
                String gwiazdka = "*";
                tekst = tekst.replaceAll(nowy, gwiazdka.repeat(length));
            }
        }
        return tekst;
    }
}
