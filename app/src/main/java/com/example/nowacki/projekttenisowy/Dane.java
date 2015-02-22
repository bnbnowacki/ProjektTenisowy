package com.example.nowacki.projekttenisowy;

/**
 * Created by Nowacki on 2015-02-01.
 */
public class Dane {
    public static final int[] punkty = {0, 15, 30, 40}; //tablica z punktacją tenisową
    public static final String przew = "Ad";

    //pola matematyczne
    public static boolean tieBreak = false;
    public static int aktualna1 = 0, aktualna2 =0;
    public static int przewaga1 =0, przewaga2 =0;
    //pola tekstowe
    public static String textPointLeft, textPointRight, textGemy, textSety="0 - 2";

    //info o zawodnikach
    public static String nazwa1, nazwa2;
    public static int gemy1, gemy2, sety1, sety2;
}
