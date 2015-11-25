package com.stanleygriggs.currencyshark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {
        EditText usdAmount = (EditText) findViewById(R.id.usdAmount);
        String usdAmountString = usdAmount.getText().toString();
        TextView resultView = (TextView) findViewById(R.id.resultView);

        double usdAmountEntry;

        if (usdAmountString.equals("") || usdAmountString.equals(".")) {
            Toast.makeText(getApplicationContext(),
                    R.string.invalid_entry_message,
                    Toast.LENGTH_LONG).show();

        }else{
            usdAmountEntry = Double.parseDouble(usdAmountString);

            double britishExchangeRate = 0.65;
            double decimalConverter = (usdAmountEntry * britishExchangeRate) * 100;
            float result = (int) decimalConverter / 100f;

            resultView.setText("That's £" + result + " POUNDS");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
