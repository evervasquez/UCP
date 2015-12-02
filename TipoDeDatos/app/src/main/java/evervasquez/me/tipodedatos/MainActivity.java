package evervasquez.me.tipodedatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double a = 0.001;
        double b = 99.99;

        BigDecimal ab = new BigDecimal(0.001);
        BigDecimal bb = new BigDecimal(99.99);


        Log.v("Resultado", Math.PI+"");

        this.initialize();
    }

    public void initialize(){
        //byte
        final byte a = 10;
        final byte b = 12;
        byte c = a + b;

        //short
        short ab = 12313;

        //integer
        int myEdad = 824823648;

        //long
        long tuEdad = 2135721637L;

        double price = 12.2;

        float price_2 = 123.34F;

        //TYPES objects

        String cadena = "    solo son letras    ";

        Log.v("Text", cadena.toUpperCase());
        Log.v("Text", cadena.trim());
        Log.v("Tamanio", cadena.length()+"");

        String[] carros = new String[5];
        carros[0] = "Toyota";
        carros[1] = "Nissan";
        carros[2] = "Ford";
        carros[3] = "Jaguar";
        carros[4] = "Mercedes";

        for (int i=0; i<carros.length; i++){
            Log.v("Array Numero "+(i+1), carros[i]);
        }

        String[][] statuses = new String[2][2];

        statuses[0][0] = "Estoy triste, pal feis";
        statuses[0][1] = "Estoy en el baño, pal feis";
        statuses[1][0] = "Estoy comiendo, pal feis";
        statuses[1][1] = "Estoy cheleando, pal feis";

        //list
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("estoy triste1");
        lista.add("estoy triste2");
        lista.add("estoy triste3");
        lista.add("estoy triste4");
        lista.add("estoy triste5");
        lista.add("estoy triste6");
        lista.add("estoy triste7");
        lista.add("estoy triste8");
        lista.add("estoy triste9");
        lista.add("estoy triste10");
        lista.add("estoy triste11");

        for (String item: lista) {
            Log.v("Item ", item);
        }

    }
}
