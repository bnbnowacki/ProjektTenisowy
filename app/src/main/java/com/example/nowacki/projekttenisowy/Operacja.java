package com.example.nowacki.projekttenisowy;

/**
 * Created by Nowacki on 2015-02-01.
 */
public class Operacja {
    void DodajPunktPrawy(){
        Dane.punkty2++;
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
        SprawdzParzystoscPunktow();
        }
    }

    void DodajPunktLewy(){
        Dane.punkty1++;
        if(Dane.tieBreak==false) {
            if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 0 && Dane.przewaga2 == 0) {
                Dane.przewaga1 = 1;
                Dane.textPointLeft=""+Dane.przew;
                Dane.textPointRight="";
            } else if (Dane.aktualna1 == 3 && Dane.aktualna2 == 3 && Dane.przewaga1 == 1 && Dane.przewaga2 == 0) {
                Dane.przewaga1 = 0;
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
        SprawdzParzystoscPunktow();
        }
    }
    private void AddSetLeft(){
        Dane.sety1++;
        Dane.textSety=Dane.sety1+" - "+Dane.sety2;
    }

    private void AddSetRight(){
        Dane.sety2++;
        Dane.textSety=Dane.sety1+" - "+Dane.sety2;
    }

    private void ZmienSerwujacego(){
        if(Dane.serwis==1)Dane.serwis=2;
        else Dane.serwis=1;
    }

    private void SprawdzParzystoscPunktow(){
        int a = (Dane.aktualna1 + Dane.aktualna2)%2;
        if(a!=0)ZmienSerwujacego();
    } //już zawiera metodę ZmienSerwujacego.

    public void AddGemLeft(){
        ZmienSerwujacego();
        if(Dane.gemy1==5 && Dane.gemy2==5){Dane.gemy1++;}
        else if(Dane.gemy1==6 && Dane.gemy2==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetLeft();
        }
        else if(Dane.gemy1==5 && Dane.gemy2==6){
            Dane.gemy1++;
            Dane.tieBreak=true;
        }
        else if(Dane.gemy1==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetLeft();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            Dane.tieBreak=false;
            AddSetLeft();
        }
        else if(Dane.gemy1==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetLeft();
        }
        else {Dane.gemy1++;}
        Dane.textGemy=Dane.gemy1+" - "+Dane.gemy2;
    }

    public void AddGemRight(){
        ZmienSerwujacego();
        if(Dane.gemy1==5 && Dane.gemy2==5){Dane.gemy2++;}
        else if(Dane.gemy1==5 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetRight();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==5){
            Dane.gemy2++;
            Dane.tieBreak=true;
        }
        else if(Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetRight();
        }
        else if(Dane.gemy1==6 && Dane.gemy2==6){
            Dane.gemy1=0;
            Dane.gemy2=0;
            Dane.tieBreak=false;
            AddSetRight();
        }
        else if(Dane.gemy2==5){
            Dane.gemy1=0;
            Dane.gemy2=0;
            AddSetRight();
        }
        else {Dane.gemy2++;}
        Dane.textGemy=Dane.gemy1+" - "+Dane.gemy2;
    }
}
