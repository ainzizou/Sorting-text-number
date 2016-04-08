/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Comparator;

/**
 *
 * @author Achmad Zulkarnain
 */
public class Data implements Comparable<Data> {

    private String words;
    private int frequency;
    private int vocals;
    private int characters;

    public Data(String words) {
        this.words = words;
        this.frequency = 1;
        this.vocals = 0;
        this.characters = 0;
    }

    public Data(String words, int v, int ch) {
        this.words = words;
        this.frequency = 1;
        this.vocals = v;
        this.characters = ch;

    }

    public String getWords() {
        return words;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int getVocals() {
        return vocals;
    }

    public int getCharacters() {
        return characters;
    }

    public void setVocals(int vocals) {
        this.vocals = vocals;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public int setFrequency() {
        return frequency++;
    }

    @Override
    public int compareTo(Data t) {
        int compFreq = ((Data) t).getFrequency();
        return compFreq - this.frequency;
    }
    public static Comparator<Data> DataWordsComparator = new Comparator<Data>() {

        public int compare(Data record1, Data record2) {

            String recordWord1 = record1.getWords().toUpperCase();
            String recordWord2 = record2.getWords().toUpperCase();

            //ascending order
            return recordWord1.compareTo(recordWord2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }

    };

    public static Comparator<Data> VocalComparator
            = new Comparator<Data>() {

                public int compare(Data record1, Data record2) {

                    final int vocalWord1 = record1.getVocals();
                    final int vocalWord2 = record2.getVocals();

                    if (vocalWord1 > vocalWord2) {
                        return -1;
                    }

                    if (vocalWord1 < vocalWord2) {
                        return 1;
                    }

                    return 0;

                }

            };

    public static Comparator<Data> CharComparator
            = new Comparator<Data>() {

                public int compare(Data record1, Data record2) {

                    final int charWord1 = record1.getCharacters();
                    final int charWord2 = record2.getCharacters();

                    if (charWord1 > charWord2) {
                        return -1;
                    }

                    if (charWord1 < charWord2) {
                        return 1;
                    }

                    return 0;

                }

            };

    public static Comparator<Data> FreqComparator
            = new Comparator<Data>() {

                public int compare(Data record1, Data record2) {

                    final int freqWord1 = record1.getFrequency();
                    final int freqWord2 = record2.getFrequency();

                    if (freqWord1 > freqWord2) {
                        return -1;
                    }

                    if (freqWord1 < freqWord2) {
                        return 1;
                    }

                    return 0;

                }

            };
}
