package com.stanleygriggs.whatsyourname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void toastFunction(View view) {

        EditText enterName = (EditText) findViewById(R.id.enterName);

        Toast.makeText(getApplicationContext(),"Hello " + enterName.getText().toString() , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
