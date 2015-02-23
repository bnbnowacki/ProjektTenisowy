package com.example.nowacki.projekttenisowy;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView textGemy, textSety;
    TextView textGracz1;
    TextView textGracz2;
    TextView textPunkt1;
    TextView textPunkt2;
    TextView serw1, serw2;
    Operacja operacja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textGracz1=(TextView)findViewById(R.id.textViewGracz1);
        textGracz2=(TextView)findViewById(R.id.textViewGracz2);
        textGracz1.setText(Dane.nazwa1);
        textGracz2.setText(Dane.nazwa2);
        textPunkt1=(TextView)findViewById(R.id.pointLeft);
        textPunkt2=(TextView)findViewById(R.id.pointRight);
        textGemy=(TextView)findViewById(R.id.textViewGemy);
        textSety=(TextView)findViewById(R.id.textViewSety);
        serw1=(TextView)findViewById(R.id.textSerwis1);
        serw2=(TextView)findViewById(R.id.textSerwis2);
        operacja = new Operacja();
        SprawdzSerwis();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void ClickLeft(View view) {
        operacja.DodajPunktLewy();
        textPunkt1.setText(Dane.textPointLeft);
        textPunkt2.setText(Dane.textPointRight);
        Dane.tGemy="Gemy: "+Dane.textGemy;
        Dane.tSety="Sety: "+Dane.textSety;
        textGemy.setText(Dane.tGemy);
        textSety.setText(Dane.tSety);
        Dane.ktoryGracz=1;
        if(Dane.tryb==true){
            switch(Dane.serwis){
                case 2:
                    Intent intent=new Intent(MainActivity.this, AddPointActivity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent2=new Intent(MainActivity.this, AddPointServiceActivity.class);
                    startActivity(intent2);
            }
        }
        SprawdzSerwis();
    }

    public void ClickRight(View view) {
        operacja.DodajPunktPrawy();
        textPunkt1.setText(Dane.textPointLeft);
        textPunkt2.setText(Dane.textPointRight);
        Dane.tGemy="Gemy: "+Dane.textGemy;
        Dane.tSety="Sety: "+Dane.textSety;
        textGemy.setText(Dane.tGemy);
        textSety.setText(Dane.tSety);
        Dane.ktoryGracz=2;
        if(Dane.tryb==true){
            switch(Dane.serwis){
                case 1:
                    Intent intent=new Intent(MainActivity.this, AddPointActivity.class);
                    startActivity(intent);
                    break;
                case 2:
                    Intent intent2=new Intent(MainActivity.this, AddPointServiceActivity.class);
                    startActivity(intent2);
            }
        }
        SprawdzSerwis();
    }

    public void ClickButtonStatystyki(View view) {
        Intent intent=new Intent(MainActivity.this, StatisticsViewActivity.class);
        startActivity(intent);
    }

    private void SprawdzSerwis(){
        switch(Dane.serwis){
            case 1:
                serw1.setEnabled(true);
                serw2.setEnabled(false);
                break;

            case 2:
                serw1.setEnabled(false);
                serw2.setEnabled(true);
                break;
        }
    }
}
