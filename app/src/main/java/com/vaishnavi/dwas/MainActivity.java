package com.vaishnavi.dwas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private int SLEEP_TIMER=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread{

        public void run() {
            try {
                sleep(1000 * SLEEP_TIMER);

            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent=new Intent(MainActivity.this,Login.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    }
}
