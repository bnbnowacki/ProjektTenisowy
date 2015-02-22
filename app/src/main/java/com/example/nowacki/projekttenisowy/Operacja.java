package com.example.nowacki.projekttenisowy;

/**
 * Created by Nowacki on 2015-02-01.
 */
public class Operacja {
    void DodajPunktPrawy(){
        if(Dane.tieBreak==false) {
            if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 0 && Dane.przewaga2 == 0) {
                Dane.przewaga2 = 1;
                Dane.textPointLeft="";
                Dane.textPointRight=""+ Dane.przew;
            } else if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 0 && Dane.przewaga2 == 1) {
                Dane.przewaga2 = 0;
                Dane.aktualna1 = 0;
                Dane.aktualna2 = 0;
                Dane.textPointLeft="" + Dane.aktualna1;
                Dane.textPointRight="" + Dane.aktualna2;
                AddGemRight();

            } else if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 1 && Dane.przewaga2 == 0) {
                Dane.przewaga1 = 0;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
            } else if (Dane.aktualna2 == 3) {
                Dane.aktualna1 = 0;
                Dane.aktualna2 = 0;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
                AddGemRight();
            } else {
                Dane.aktualna2++;
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
            }
        }else {
            if(Dane.aktualna2>Dane.aktualna1 && Dane.aktualna2>5){
                Dane.aktualna1=0;
                Dane.aktualna2=0;
                Dane.textPointLeft="" + Dane.aktualna1;
                Dane.textPointRight="" + Dane.aktualna2;
                AddGemRight();
                Dane.tieBreak=false;
            }else {
                Dane.aktualna2++;
                Dane.textPointLeft="" + Dane.aktualna1;
                Dane.textPointRight="" + Dane.aktualna2;

            }

        }
    }

    void DodajPunktLewy(){
        if(Dane.tieBreak==false) {
            if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 0 && Dane.przewaga2 == 0) {
                Dane.przewaga1 = 1;
                Dane.textPointLeft=""+Dane.przew;
                Dane.textPointRight="";
            } else if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 1 && Dane.przewaga2 == 0) {
                Dane.przewaga2 = 0;
                Dane.aktualna1 = 0;
                Dane.aktualna2 = 0;
                Dane.textPointLeft="" + Dane.aktualna1;
                Dane.textPointRight="" + Dane.aktualna2;
                AddGemLeft();

            } else if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 0 && Dane.przewaga2 == 1) {
                Dane.przewaga2 = 0;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
            } else if (Dane.aktualna1 == 3) {
                Dane.aktualna1 = 0;
                Dane.aktualna2 = 0;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
                AddGemLeft();
            } else {
                Dane.aktualna1++;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
            }
        }else {
            if(Dane.aktualna1>Dane.aktualna2 && Dane.aktualna1>5){
                Dane.aktualna1=0;
                Dane.aktualna2=0;
                Dane.textPointLeft="" + Dane.punkty[Dane.aktualna1];
                Dane.textPointRight="" + Dane.punkty[Dane.aktualna2];
                AddGemLeft();
                Dane.tieBreak=false;
            }else {
                Dane.aktualna1++;
                Dane.textPointLeft="" + Dane.aktualna1;
                Dane.textPointRight="" + Dane.aktualna2;

            }

        }
    }

    public void AddGemLeft(){
        if(Dane.gemy1==5 && Dane.gemy2==5){Dane.gemy1++;}
        else if(Dane.gemy1==6 && Dane.gemy2==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else if(Dane.gemy1==5 && Dane.gemy2==6){
            Dane.gemy1++;
            Dane.tieBreak=true;
        }
        else if(Dane.gemy1==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            Dane.tieBreak=false;
            //DodajSet1();
        }
        else if(Dane.gemy1==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else {Dane.gemy1++;}
        Dane.textGemy=Dane.gemy1+" - "+Dane.gemy2;
    }

    public void AddGemRight(){
        if(Dane.gemy1==5 && Dane.gemy2==5){Dane.gemy2++;}
        else if(Dane.gemy1==5 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==5){
            Dane.gemy2++;
            Dane.tieBreak=true;
        }
        else if(Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            Dane.tieBreak=false;
            //DodajSet1();
        }
        else if(Dane.gemy2==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            //DodajSet1();
        }
        else {Dane.gemy2++;}
        Dane.textGemy=Dane.gemy1+" - "+Dane.gemy2;
    }
}
