package com.example.nowacki.projekttenisowy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class StatisticsViewActivity extends ActionBarActivity {
    TextView tvGracz1, tvGracz2, tvPunkty1, tvPunkty2, tvSerwis1, tvSerwis2, tvAsy1, tvAsy2, tvPodwojne1, tvPodwojne2,
    tvWinners1, tvWinners2, tvNiewymuszone1, tvNiewymuszone2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_view);
        WczytajTextView();
        PrzypiszTextView();
        SprawdzCzyZaawansowany();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_statistics_view, menu);
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
    public void WczytajTextView(){
        tvGracz1=(TextView)findViewById(R.id.textGracz1);
        tvGracz2=(TextView)findViewById(R.id.textGracz2);
        tvPunkty1=(TextView)findViewById(R.id.textPunkty1);
        tvPunkty2=(TextView)findViewById(R.id.textPunkty2);
        tvSerwis1=(TextView)findViewById(R.id.textSerwis1);
        tvSerwis2=(TextView)findViewById(R.id.textSerwis2);
        tvAsy1=(TextView)findViewById(R.id.textAsy1);
        tvAsy2=(TextView)findViewById(R.id.textAsy2);
        tvPodwojne1=(TextView)findViewById(R.id.textPodwojne1);
        tvPodwojne2=(TextView)findViewById(R.id.textPodwojne2);
        tvWinners1=(TextView)findViewById(R.id.textWinners1);
        tvWinners2=(TextView)findViewById(R.id.textWinners2);
        tvNiewymuszone1=(TextView)findViewById(R.id.textNiewymuszone1);
        tvNiewymuszone2=(TextView)findViewById(R.id.textNiewymuszone2);
    }

    public void PrzypiszTextView(){
        float proc1 = Dane.serw11/(Dane.serw11+Dane.serw21)*100;
        float proc2 = Dane.serw12/(Dane.serw12+Dane.serw22)*100;
        tvGracz1.setText(Dane.nazwa1);
        tvGracz2.setText(Dane.nazwa2);
        tvPunkty1.setText(""+Dane.punkty1);
        tvPunkty2.setText(""+Dane.punkty2);
        tvSerwis1.setText(""+(int)proc1+"%("+(int)Dane.serw11+"/"+(int)Dane.serw21+")");
        tvSerwis2.setText(""+(int)proc2+"%("+(int)Dane.serw12+"/"+(int)Dane.serw22+")");
        tvAsy1.setText(""+Dane.asy1);
        tvAsy2.setText(""+Dane.asy2);
        tvPodwojne1.setText(""+Dane.podwojny1);
        tvPodwojne2.setText(""+Dane.podwojny2);
        tvWinners1.setText(""+Dane.winner1);
        tvWinners2.setText(""+Dane.winner2);
        tvNiewymuszone1.setText(""+Dane.blad1);
        tvNiewymuszone2.setText(""+Dane.blad2);
    }
    private void SprawdzCzyZaawansowany(){
        if(Dane.tryb==false){
            tvSerwis1.setEnabled(false);
            tvSerwis2.setEnabled(false);
            tvAsy1.setEnabled(false);
            tvAsy2.setEnabled(false);
            tvPodwojne1.setEnabled(false);
            tvPodwojne2.setEnabled(false);
            tvWinners1.setEnabled(false);
            tvWinners2.setEnabled(false);
            tvNiewymuszone1.setEnabled(false);
            tvNiewymuszone2.setEnabled(false);
        }
    }

    public void ClickButtonPowrot(View view) {
        finish();
    }
}
