package com.brayanhoyos.colombia_turstica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class bar3 extends AppCompatActivity implements View.OnTouchListener{
int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar3);
        View bar3=findViewById(R.id.bar3);
        bar3.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar3, menu);
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

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (cont==0){

            Toast.makeText(this, "Idiom English", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.bar33);
            sit1.setText(R.string.infob3e);
            cont++;
        } else {

            Toast.makeText(this, "Idioma Español", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.bar33);
            sit1.setText(R.string.infob3);
            cont=0;
        }
        return false;
    }
}
