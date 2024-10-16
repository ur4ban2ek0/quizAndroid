package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 private    ArrayList<Pytanie> ListaPytan = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void wypelnijPytania(){
        ListaPytan.add(new Pytanie("Czy sekwoja może miec 100 metrów wysokosci?" "sekwoje sa bardzo wysokie", true));
        ListaPytan.add(new Pytanie("Czy najgrubsze drzewo ma obwód 10m?", "Obwód najwieszego drzewa ma 44m", false));
        ListaPytan.add(new Pytanie("Czy drzewa sa pochlaniaczem tlenu?", "Zastanow sie na czym polega fotosymteza", false));
    }


}