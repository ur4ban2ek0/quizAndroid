package com.example.quiz;

public class Pytanie {
    private String tresc;
    private String odpowiedz;
    private boolean poprawna;
    private boolean udzielonopoprawnaOdpowiedz;

    public Pytanie(String tresc, String odpowiedz, boolean poprawna) {
        this.tresc = tresc;
        this.odpowiedz = odpowiedz;
        this.poprawna = poprawna;
    }

    public String getTresc() {
        return tresc;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public boolean isPoprawna() {
        return poprawna;
    }

    public boolean isUdzielonopoprawnaOdpowiedz() {
        return udzielonopoprawnaOdpowiedz;
    }

    public void setUdzielonopoprawnaOdpowiedz(boolean udzielonopoprawnaOdpowiedz) {
        this.udzielonopoprawnaOdpowiedz = udzielonopoprawnaOdpowiedz;
    }


}
