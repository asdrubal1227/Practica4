package com.brayanhoyos.colombia_turstica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Bares extends AppCompatActivity implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        View bar1=findViewById(R.id.bar1);
        View bar2=findViewById(R.id.bar2);
        View bar3=findViewById(R.id.bar3);
        bar1.setOnTouchListener(this);
        bar2.setOnTouchListener(this);
        bar3.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
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
            TextView sit1 = (TextView) findViewById(R.id.tibar);
            sit1.setText(R.string.titlem);
            return true;
        }

        if (id == R.id.ingles) {
            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.tibar);
            sit1.setText(R.string.titleme);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch(v.getId()) {
            case R.id.bar1:
                Toast.makeText(this, "Cafe Bar Maria Mulata", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i = new Intent(this, bar1.class);
                startActivity(i);
                break;
            case R.id.bar2:
                Toast.makeText(this, "Mestizo Peña Bar", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i2 = new Intent(this, bar2.class);
                startActivity(i2);
                break;
            case R.id.bar3:
                Toast.makeText(this, "Coyote Ugly (Cafe Bar)", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i3 = new Intent(this, bar3.class);
                startActivity(i3);
                break;
        }

        return false;
    }
}
