package juegodedados.evervasquez.me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import core.Jugador;

public class MainActivity extends AppCompatActivity{
    private TextView txt_jugador1;
    private TextView txt_jugador2;
    private TextView txt_resultado;
    private int resultado1;
    private int resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_jugador1 = (TextView) findViewById(R.id.txt_jugador1);
        txt_jugador2 = (TextView) findViewById(R.id.txt_jugador2);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
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

    public void jugar(View view) {

        Jugador jugador1 = new Jugador("Juan");
        Jugador jugador2 = new Jugador("Miguel");

        this.resultado1 = jugador1.lanzar("rojo");
        this.resultado2 = jugador2.lanzar("azul");

        this.txt_jugador1.setText(this.resultado1 + "");
        this.txt_jugador2.setText(this.resultado2 + "");

        if (this.resultado1 > this.resultado2) {
            this.txt_resultado.setText("El ganador es "+jugador1.getNombre());
        } else if (this.resultado1 < this.resultado2) {
            this.txt_resultado.setText("El ganador es "+jugador2.getNombre());
        } else {
            this.txt_resultado.setText("hubo un empate");
        }
    }
}
