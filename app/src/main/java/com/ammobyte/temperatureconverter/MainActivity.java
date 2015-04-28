package com.ammobyte.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "com.ammobyte.temperatureconverter.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    //called when button is pressed
    public void sendTemp(View view){
        //create intent to start DisplayTemp activity
        Intent intent = new Intent(this, DisplayTempActivity.class);
        //get entered value
        EditText editText = (EditText) findViewById(R.id.enterText);
        String value = editText.getText().toString();
        //and add it to the intent with a special key (EXTRA_MESSAGE)
        intent.putExtra(EXTRA_MESSAGE, value);
        startActivity(intent);
    }
}
