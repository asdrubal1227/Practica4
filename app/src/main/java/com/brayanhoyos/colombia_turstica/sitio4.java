package com.brayanhoyos.colombia_turstica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class sitio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sitio4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement

        if (id == R.id.español) {
            Toast.makeText(this, "Idioma Español", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.sit4);
            sit1.setText(R.string.infos4);
            return true;
        }

        if (id == R.id.ingles) {
            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.sit4);
            sit1.setText(R.string.infos4e);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
