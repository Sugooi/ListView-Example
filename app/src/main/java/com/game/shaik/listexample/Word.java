package com.game.shaik.listexample;

/**
 * Created by shaik on 01-02-2019.
 */

public class Word {
    String eng_word,hindi_word;

    public Word(String eng_word, String hindi_word) {
        this.eng_word = eng_word;
        this.hindi_word = hindi_word;
    }

    public String getEng_word() {
        return eng_word;
    }

    public void setEng_word(String eng_word) {
        this.eng_word = eng_word;
    }

    public String getHindi_word() {
        return hindi_word;
    }

    public void setHindi_word(String hindi_word) {
        this.hindi_word = hindi_word;
    }
}
