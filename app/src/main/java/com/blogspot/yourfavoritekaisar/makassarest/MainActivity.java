package com.blogspot.yourfavoritekaisar.makassarest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.monumen)
    Button monumen;
    @BindView(R.id.mandala)
    RelativeLayout mandala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.monumen)
    public void onViewClicked() {
        Intent pindah = new Intent(this, popup_Activity.class);
        startActivity(pindah);
    }
}
