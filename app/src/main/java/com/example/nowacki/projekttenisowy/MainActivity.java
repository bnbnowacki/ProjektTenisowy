package com.example.nowacki.projekttenisowy;

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
        textSety.setText(Dane.textSety);
        operacja = new Operacja();
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
        textGemy.setText(Dane.textGemy);
    }

    public void ClickRight(View view) {
        operacja.DodajPunktPrawy();
        textPunkt1.setText(Dane.textPointLeft);
        textPunkt2.setText(Dane.textPointRight);
        textGemy.setText(Dane.textGemy);
    }
}
