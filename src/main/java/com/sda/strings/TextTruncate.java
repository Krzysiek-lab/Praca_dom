package com.sda.strings;

public class TextTruncate implements StringOperation {
    int length;

    public TextTruncate(int length) {
        this.length = length;
    }

    @Override
    public String modify(String tekst) {
        return tekst.substring(0, length);
    }

    // SPRAWDZENIE
    public static void main(String[] args) {
        StringOperation op = new TextCensor("mama", "tata");
        System.out.println(op.modify("Ala i jej mama i jej tata maja kota"));
        StringOperation op2 = new TextTruncate(8);
        System.out.println(op2.modify("ala ma czarnego kota filemona"));
        StringOperation op3 = new TextDuplicate();
        System.out.println(op3.modify("tato"));
        StringOperation op4 = new TextUpperCase();
        System.out.println(op4.modify("mama"));
        StringOperation op5 = new TextReverse();
        System.out.println(op5.modify("tatot"));
        StringOperation op6 = new Textdots("ma", "czarnego");
        System.out.println(op6.modify("Ala ma czarnego kota filemona"));
    }
}
