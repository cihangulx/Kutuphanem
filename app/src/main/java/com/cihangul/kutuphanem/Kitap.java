package com.cihangul.kutuphanem;

import android.content.Context;

/**
 * Created by Cihan on 18.11.2016.
 */

public class Kitap {
    private String kitapIsmi;
    private String kitapYazari;
    private String kitapBasimYili;
    private String kitapYayinEvi;
    private int kitapResmi;

    public Kitap() {
    }

    public Kitap(String kitapIsmi, String kitapYazari, String kitapBasimYili, String kitapYayinEvi, int kitapResmi) {
        this.kitapIsmi = kitapIsmi;
        this.kitapYazari = kitapYazari;
        this.kitapBasimYili = kitapBasimYili;
        this.kitapYayinEvi = kitapYayinEvi;
        this.kitapResmi = kitapResmi;
    }

    public String getKitapIsmi() {
        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public String getKitapBasimYili() {
        return kitapBasimYili;
    }

    public void setKitapBasimYili(String kitapBasimYili) {
        this.kitapBasimYili = kitapBasimYili;
    }

    public String getKitapYayinEvi() {
        return kitapYayinEvi;
    }

    public void setKitapYayiEevi(String kitapYayinEvi) {
        this.kitapYayinEvi = kitapYayinEvi;
    }

    public int getKitapResmi() {
        return kitapResmi;
    }

    public void setKitapResmi(int kitapResmi) {
        this.kitapResmi = kitapResmi;
    }
}
