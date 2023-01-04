package com.example.pem_mobile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "085778004728" ;
        Intent panggil = new Intent(Intent.
                ACTION_DIAL);
        panggil.setData(Uri.
                fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "https://www.google.com" ;
        Intent bukabrowser = new Intent(Intent.
                ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this,
                Tentang.class);
        startActivity(tentang);
    }

}