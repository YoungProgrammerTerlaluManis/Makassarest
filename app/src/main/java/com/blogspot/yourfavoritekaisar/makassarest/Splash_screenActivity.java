package com.blogspot.yourfavoritekaisar.makassarest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_screenActivity extends AppCompatActivity {
    private long ms = 0;
    private long splashtime = 3000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // TODO 2 Membuat Thread
        Thread mythread = new Thread(){
            public void run(){
                try{
                    // TODO 3 Melakukan perulangan sampai ms > 3000
                    while(splashActive && ms < splashtime){
                        if (!paused){
                            ms = ms + 100;
                            sleep(100);
                        }
                    }
                }catch (Exception e) {

                    // TODO 4 setelah perulangan selesai maka akan berpindah halaman menggunakan intent
                } finally {
                    Intent intent = new Intent(Splash_screenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        // TODO 5 Menjalankan Object mythread
        mythread.start();


    }
}
