package com.ammobyte.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayTempActivity extends ActionBarActivity {

    int tempF, tempC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_temp);
        Intent intent = getIntent();
        String temperature = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        tempF = Integer.parseInt(temperature);
        tempC = tempF-32; tempC*=5; tempC/=9;

        //display message
        TextView textViewF = (TextView) findViewById(R.id.fah);
        textViewF.setText(tempF+"°F");
        TextView textViewC = (TextView) findViewById(R.id.cel);
        textViewC.setText(tempC+"°C");
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
}
