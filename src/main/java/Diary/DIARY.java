package Diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DIARY {
    private List<Entry> entries = new ArrayList<>();

    private class Entry {
        LocalDate date;
        String text;

        Entry(String text, LocalDate date) {
            this.text = text;
            this.date = date;

        }
    }

    public void writeEntry(String text) {
        // kod dodający nowy wpis z dzisiejszą datą
        //entries.add(new Entry("No text with given date", LocalDate.now()));
        entries.add(new Entry(text, LocalDate.now()));
    }

    public Object getEntriesFrom(LocalDate date) {
        // kod zwracający wpisy z odpowiednią datą
        for (Entry pod : entries) {
            if (pod.date.isEqual(date)) {
                System.out.println(pod.text);
            }
        }
        return entries.get(0).date; // ?????????????
    }

    public static void main(String[] args) {
        DIARY bb = new DIARY();
        bb.writeEntry("slowo");
        bb.writeEntry("slowo2");
        System.out.println(bb.getEntriesFrom(LocalDate.now()));
        //System.out.println(bb.entries.get(1).date);
//        System.out.println(bb.entries.get(0).date);
//        System.out.println(bb.entries.get(0).text);
//        System.out.println(bb.entries.get(1).date);
//        System.out.println(bb.entries.get(1).text);


    }
}
