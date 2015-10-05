package com.brayanhoyos.colombia_turstica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HotelActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        View hotel1=findViewById(R.id.hotel1);
        View hotel2=findViewById(R.id.hotel2);
        View hotel3=findViewById(R.id.hotel3);
        hotel1.setOnTouchListener(this);
        hotel2.setOnTouchListener(this);
        hotel3.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hotel, menu);
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
            TextView sit1 = (TextView) findViewById(R.id.tihotel);
            sit1.setText(R.string.titlem);
            TextView sit3 = (TextView) findViewById(R.id.ho);
            sit3.setText(R.string.ho);
            return true;
        }

        if (id == R.id.ingles) {
            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.tihotel);
            sit1.setText(R.string.titleme);
            TextView sit3 = (TextView) findViewById(R.id.ho);
            sit3.setText(R.string.hoe);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        // Check which checkbox was clicked
        switch(v.getId()) {
            case R.id.hotel1:
                Toast.makeText(this, "Hotel La Maison", Toast.LENGTH_SHORT).show();
                    //Abrir la actividad
                    Intent i = new Intent(this, hotel1.class);
                    startActivity(i);
                break;
            case R.id.hotel2:
                    Toast.makeText(this, "Loft Hotel", Toast.LENGTH_SHORT).show();
                    //Abrir la actividad
                    Intent i2 = new Intent(this, hotel2.class);
                    startActivity(i2);
                break;
            case R.id.hotel3:
                    Toast.makeText(this, "Hotel Venecia", Toast.LENGTH_SHORT).show();
                    //Abrir la actividad
                    Intent i3 = new Intent(this, hotel3.class);
                    startActivity(i3);
                break;
        }

        return false;
    }
}
