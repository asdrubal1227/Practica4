package com.brayanhoyos.colombia_turstica;

import java.util.Locale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View hotel=findViewById(R.id.hotelinfop);
        hotel.setOnTouchListener(this);
        View bar=findViewById(R.id.bares);
        bar.setOnTouchListener(this);
        View turismo=findViewById(R.id.turismo);
        turismo.setOnTouchListener(this);

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
        if (id == R.id.español) {
            Toast.makeText(this, "Idioma Español", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.publi);
            sit1.setText(R.string.publicidad);
            return true;
        }

        if (id == R.id.ingles) {
            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.publi);
            sit1.setText(R.string.publicidade);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
switch (v.getId()) {
    case (R.id.hotelinfop):
            Toast.makeText(this, "Menu Hotel", Toast.LENGTH_SHORT).show() ;
        //Abrir la actividad
        Intent i = new Intent(this, HotelActivity.class);
        startActivity(i);
        break;
    case (R.id.bares):
            Toast.makeText(this, "Menu Bares", Toast.LENGTH_SHORT).show() ;
        //Abrir la actividad
        Intent i2 = new Intent(this, Bares.class);
        startActivity(i2);
        break;
    case (R.id.turismo):
        Toast.makeText(this, "Menu Turismo", Toast.LENGTH_SHORT).show() ;
        //Abrir la actividad
        Intent i3 = new Intent(this, sitios.class);
        startActivity(i3);
        break;
}
        return false;
    }
}
