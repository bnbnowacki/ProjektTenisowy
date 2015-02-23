package com.example.nowacki.projekttenisowy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;


public class AddPointServiceActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_point_service);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_point, menu);
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
    public void ClickButtonSerwis(View view) {
        boolean sprawdz =((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.pierwszy:
                if(sprawdz){
                    Dane.buforSerw1=1;
                    Dane.buforSerw2=0;
                }
                break;

            case R.id.drugi:
                if(sprawdz){
                    Dane.buforSerw1=0;
                    Dane.buforSerw2=1;
                }
                break;
        }
    }

    public void ClickTypPunktu(View view) {
        boolean sprawdz =((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.winner:
                if(sprawdz){
                    Dane.buforWin=1;
                    Dane.buforBlad=0;
                    Dane.buforPodwojny=0;
                    Dane.buforAs=0;
                }
                break;

            case R.id.blad:
                if(sprawdz){
                    Dane.buforWin=0;
                    Dane.buforBlad=1;
                    Dane.buforPodwojny=0;
                    Dane.buforAs=0;
                }
                break;

            case R.id.as:
                if(sprawdz){
                    Dane.buforAs=1;
                    Dane.buforWin=1;
                    Dane.buforBlad=0;
                    Dane.buforPodwojny=0;
                }
                break;
        }
    }

    public void ClickZatwierdz(View view) {
        if(Dane.ktoryGracz==1){
            Dane.serw11=Dane.serw11 + Dane.buforSerw1;
            Dane.serw21=Dane.serw21 + Dane.buforSerw2;

            Dane.winner1=Dane.winner1 + Dane.buforWin;
            Dane.blad2=Dane.blad2 + Dane.buforBlad;
            Dane.asy1=Dane.asy1 + Dane.buforAs;
        }

        if(Dane.ktoryGracz==2){
            Dane.serw12=Dane.serw12 + Dane.buforSerw1;
            Dane.serw22=Dane.serw22 + Dane.buforSerw2;

            Dane.winner2=Dane.winner2 + Dane.buforWin;
            Dane.blad1=Dane.blad1 + Dane.buforBlad;
            Dane.asy2=Dane.asy2 + Dane.buforPodwojny;
        }
        finish();
    }
}
