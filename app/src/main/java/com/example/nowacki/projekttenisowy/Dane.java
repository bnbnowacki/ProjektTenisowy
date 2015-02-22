package com.example.nowacki.projekttenisowy;

/**
 * Created by Nowacki on 2015-02-01.
 */
public class Dane {
    public static final int[] punkty = {0, 15, 30, 40}; //tablica z punktacją tenisową
    public static final String przew = "Ad";
    public static boolean tryb;

    //pola matematyczne
    public static boolean tieBreak = false;
    public static int aktualna1 = 0, aktualna2 =0;
    public static int przewaga1 =0, przewaga2 =0;
    //pola tekstowe
    public static String textPointLeft, textPointRight, textGemy, textSety="0 - 2";

    //pole do sprawdzania ktory zawodnik otworzyl okno zaawansowane
    public static int ktoryGracz;

    //info o zawodnikach
    public static String nazwa1, nazwa2;
    public static int gemy1, gemy2, sety1, sety2;
    public static int punkty1, punkty2, winner1, winner2, blad1, blad2, podwojny1, podwojny2, asy1, asy2;
    public static float serw11, serw12, serw21, serw22;

    //tymczasowe dane do RadioButtonów
    public static int buforSerw1;
    public static int buforSerw2;

    public static int buforWin;
    public static int buforBlad;
    public static int buforPodwojny;
    public static int buforAs;
}
