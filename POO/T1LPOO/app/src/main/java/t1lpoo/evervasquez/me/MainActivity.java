package t1lpoo.evervasquez.me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import t1lpoo.evervasquez.me.clases_abstractas.ejemplo1.Cuadrado;
import t1lpoo.evervasquez.me.clases_abstractas.ejemplo1.Triangulo;
import t1lpoo.evervasquez.me.clases_abstractas.ejemplo2.MapaSatelital;
import t1lpoo.evervasquez.me.herencia.Auto;
import t1lpoo.evervasquez.me.herencia.Combi;
import t1lpoo.evervasquez.me.interfaces.Furgon;
import t1lpoo.evervasquez.me.interfaces.Vehiculo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("onCreate", "onCreate");

        //example1 class abstract
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();

        Log.v("cuadrado - abstract", cuadrado.perimetroX3() + "");
        Log.v("triangulo - abstract", triangulo.perimetroX3() + "");

        //example2 class abstract
        MapaSatelital mapaSatelital = new MapaSatelital();
        Log.v("Mapa Satelital", mapaSatelital.CrearMapa());

        //example1 interfaces
        Vehiculo vehiculo = new Vehiculo(new Furgon());
        Log.v("Moto - Interface", vehiculo.retroceder());

        Toast.makeText(this, "Hello Word", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Combi combi = new Combi();
        combi.setModelo("Orion");
        String message = combi.apaga();
        Log.v("onStart", message);
        Log.v("Combi - Modelo", combi.getModelo());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Auto auto = new Auto();
        Log.v("Auto", auto.encender());
        Log.v("onResume", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "onStop");
    }
}
