package com.brayanhoyos.colombia_turstica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class bar2 extends AppCompatActivity implements View.OnTouchListener{
int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar2);
        View bar2=findViewById(R.id.bar2);
        bar2.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar2, menu);
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
            TextView sit1 = (TextView) findViewById(R.id.bar22);
            sit1.setText(R.string.infob2e);
            cont++;
        } else {

            Toast.makeText(this, "Idioma Español", Toast.LENGTH_SHORT).show();
            TextView sit1 = (TextView) findViewById(R.id.bar22);
            sit1.setText(R.string.infob2);
            cont=0;
        }
        return false;
    }
}
