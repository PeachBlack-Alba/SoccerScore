package com.example.soccerkeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /** Goals and fouls variables initialization */
    int BarcelonaGoles;
    int barcelonaFaltas;
    int madridGoles;
    int madridFaltas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayBarcelonaGoles();
        displayBarcelonaFaltas();
        displayMadridGoles();
        displayMadridFaltas();
    }

    /** Updates the Team A goals counter TextView */
    public void displayBarcelonaGoles() {
        TextView textViewBarcelonaGoles = (TextView) findViewById(R.id.text_view_barcelona_goles);
        textViewBarcelonaGoles.setText("" + BarcelonaGoles);
    }

    /** Updates the Team A fouls counter TextView */
    public void displayBarcelonaFaltas() {
        TextView textViewBarcelonaFaltas = (TextView) findViewById(R.id.text_view_barcelona_faltas);
        textViewBarcelonaFaltas.setText("" + barcelonaFaltas);
    }

    /** Updates the Team B goals counter TextView */
    public void displayMadridGoles() {
        TextView textViewMadridGoles = (TextView) findViewById(R.id.text_view_madrid_goles_counter);
        textViewMadridGoles.setText("" + madridGoles);
    }

    /** Updates the Team B fouls counter TextView */
    public void displayMadridFaltas() {
        TextView textViewMadridFaltas = (TextView) findViewById(R.id.text_view_madrid_faltas_counter);
        textViewMadridFaltas.setText("" + madridFaltas);
    }

    /**
     * This method is called by the counter buttons (- and +) to update their corresponding variable and call their respective "display" method
     * @param view the Button view that called the method
     */
    public void changeCounter(View view) {
        switch (view.getId()) {
            case R.id.barcelona_goles__minus:
                if (BarcelonaGoles == 0) {
                    return;
                }
                BarcelonaGoles--;
                displayBarcelonaGoles();
                break;
            case R.id.barcelona_goles_plus:
                BarcelonaGoles++;
                displayBarcelonaGoles();
                break;
            case R.id.button_barcelona_faltas_minus:
                if (barcelonaFaltas == 0) {
                    return;
                }
                barcelonaFaltas--;
                displayBarcelonaFaltas();
                break;
            case R.id.button_barcelona_faltas_plus:
                barcelonaFaltas++;
                displayBarcelonaFaltas();
                break;
            case R.id.button_madrid_goles_minus:
                if (madridGoles == 0) {
                    return;
                }
                madridGoles--;
                displayMadridGoles();
                break;
            case R.id.button_madrid_goles_plus:
                madridGoles++;
                displayMadridGoles();
                break;
            case R.id.button_madrid_faltas_minus:
                if (madridFaltas == 0) {
                    return;
                }
                madridFaltas--;
                displayMadridFaltas();
                break;
            case R.id.button_madrid_faltas_plus:
                madridFaltas++;
                displayMadridFaltas();
                break;
        }
    }

    /** This method assigns the value 0 to all variables and calls all "display" methods
     * @param view the view that called the method i.e. the Reset Button view */
    public void resetAllCounters(View view) {
        BarcelonaGoles = 0;
        barcelonaFaltas = 0;
        madridGoles = 0;
        madridFaltas = 0;
        displayBarcelonaGoles();
        displayBarcelonaFaltas();
        displayMadridGoles();
        displayMadridFaltas();
    }

}
