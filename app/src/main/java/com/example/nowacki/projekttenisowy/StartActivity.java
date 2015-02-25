package com.example.nowacki.projekttenisowy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;


public class StartActivity extends ActionBarActivity {
    boolean czyLosowac=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ClickStart(View view) {
        EditText ed1 = (EditText)findViewById(R.id.editText1);
        EditText ed2 = (EditText)findViewById(R.id.editText2);
        Dane.nazwa1 = ed1.getText().toString();
        Dane.nazwa2 = ed2.getText().toString();
        LosujSerwis();
        CzyscDane();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickButtonTryb(View view) {
        boolean sprawdz =((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.prosty:
                if(sprawdz){
                    Dane.tryb=false;
                }
            break;

            case R.id.zaawansowany:
                if(sprawdz){
                    Dane.tryb=true;
                }
            break;

        }
    }

    public void ClickButtonSerwis(View view) {
        boolean zaznaczony = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.zaw1:
                if(zaznaczony)Dane.serwis=1;
                break;
            case R.id.zaw2:
                if(zaznaczony)Dane.serwis=2;
                break;
            case R.id.losujSerwis:
                if(zaznaczony){
                    czyLosowac=true;
                }else czyLosowac=false;
        }
    }

    private void LosujSerwis(){
        if(czyLosowac==true) {
            String komunikat="";
            Context context = getApplicationContext();
            int a;
            Random random = new Random();
            do {
                a = random.nextInt(3);
            } while (a == 0);
            switch(a){
                case 1:
                    komunikat=Dane.nazwa1;
                    break;
                case 2:
                    komunikat=Dane.nazwa2;
                    break;
            }
            Toast drugiKomunikat = Toast.makeText(context, "Serwuje "+komunikat, Toast.LENGTH_SHORT);
            Dane.serwis = a;
            drugiKomunikat.show();
        }
    }
    private void CzyscDane(){
        Dane.gemy1=0;
        Dane.gemy2=0;
        Dane.sety1=0;
        Dane.sety2=0;
        Dane.punkty1=0;
        Dane.punkty2=0;
        Dane.winner1=0;
        Dane.winner2=0;
        Dane.blad1=0;
        Dane.blad2=0;
        Dane.podwojny1=0;
        Dane.podwojny2=0;
        Dane.asy1=0;
        Dane.asy2=0;
        Dane.serw11=0;
        Dane.serw12=0;
        Dane.serw21=0;
        Dane.serw22=0;
        Dane.aktualna1=0;
        Dane.aktualna2=0;
    }
}
