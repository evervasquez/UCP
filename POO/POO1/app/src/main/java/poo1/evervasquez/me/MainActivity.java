package poo1.evervasquez.me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import poo1.evervasquez.me.POO.Planta;
import poo1.evervasquez.me.POO.Plantita;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Planta palta = new Planta();
        Plantita plantita = new Plantita();

        Planta naranja = new Planta("naranja","rojo");


        Log.v("Planta",palta.nombre+" - color: "+palta.color);
        Log.v("Planta1 nombre",naranja.nombre+" - color: "+naranja.color);
        Log.v("Plantita ",plantita.crecer());
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
}
