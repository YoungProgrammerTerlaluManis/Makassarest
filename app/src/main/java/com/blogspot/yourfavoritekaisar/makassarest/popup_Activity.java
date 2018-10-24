package com.blogspot.yourfavoritekaisar.makassarest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class popup_Activity extends AppCompatActivity {

    @BindView(R.id.logopsm)
    Button logopsm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.logopsm)
    public void onViewClicked() {
        Toast.makeText(this, "Aplikasi Masih Dalam Tahap Pengembangan \nSilahkan hubungi Email pengembang \nammaralghifary@gmail.com"
                ,Toast.LENGTH_SHORT).show();
    }
}
