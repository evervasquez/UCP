package t1lpoo.evervasquez.me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import t1lpoo.evervasquez.me.herencia.Combi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("onCreate", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Combi combi = new Combi();
        String message = combi.apagar();
        Log.v("onStart", message);
    }

    @Override
    protected void onResume() {
        super.onResume();
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
