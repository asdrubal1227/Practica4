package com.brayanhoyos.colombia_turstica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class sitios extends AppCompatActivity implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_sitios);
        View sitio1=findViewById(R.id.sitio1);
        View sitio2=findViewById(R.id.sitio2);
        View sitio3=findViewById(R.id.sitio3);
        View sitio4=findViewById(R.id.sitio4);
        View sitio5=findViewById(R.id.sitio5);
        sitio1.setOnTouchListener(this);
        sitio2.setOnTouchListener(this);
        sitio3.setOnTouchListener(this);
        sitio4.setOnTouchListener(this);
        sitio5.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sitios, menu);
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
            TextView sit1 = (TextView) findViewById(R.id.titu);
            sit1.setText(R.string.titlem);
            TextView sit3 = (TextView) findViewById(R.id.sit);
            sit3.setText(R.string.tu);
            return true;
        }

        if (id == R.id.ingles) {
            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.titu);
            sit1.setText(R.string.titleme);
            TextView sit3 = (TextView) findViewById(R.id.sit);
            sit3.setText(R.string.tue);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch(v.getId()) {
            case R.id.sitio1:
                Toast.makeText(this, "Santuario de Las Lajas", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i = new Intent(this, sitio1.class);
                startActivity(i);
                break;
            case R.id.sitio2:
                Toast.makeText(this, "Laguna de la Cocha", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i2 = new Intent(this, sitio2.class);
                startActivity(i2);
                break;
            case R.id.sitio3:
                Toast.makeText(this, "El Volcán Galeras", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i3 = new Intent(this, sitio3.class);
                startActivity(i3);
                break;
            case R.id.sitio4:
                Toast.makeText(this, "Carnaval de Negros y Blancos", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i4 = new Intent(this, sitio4.class);
                startActivity(i4);
                break;
            case R.id.sitio5:
                Toast.makeText(this, "Catedral de Pasto", Toast.LENGTH_SHORT).show();
                //Abrir la actividad
                Intent i5 = new Intent(this, sitio5.class);
                startActivity(i5);
                break;
        }
        return false;
    }
}
