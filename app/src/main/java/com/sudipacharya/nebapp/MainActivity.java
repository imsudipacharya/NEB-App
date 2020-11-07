package com.sudipacharya.nebapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    ImageButton mof,miw,q1,ne,q2,hw,mw,q3,le,wb;
    private InterstitialAd interstitialAd10,interstitialAd,interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6,interstitialAd7,interstitialAd8,interstitialAd9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "986424201853483_986424565186780");
        interstitialAd.loadAd();



        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, "986424201853483_986426685186568");
        interstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd2 = new InterstitialAd(this, "986424201853483_986425205186716");
        interstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd3 = new InterstitialAd(this, "986424201853483_986425331853370");
        interstitialAd3.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd4 = new InterstitialAd(this, "986424201853483_986425478520022");
        interstitialAd4.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd5 = new InterstitialAd(this, "986424201853483_986425635186673");
        interstitialAd5.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd6 = new InterstitialAd(this, "986424201853483_986425831853320");
        interstitialAd6.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd7 = new InterstitialAd(this, "986424201853483_986425721853331");
        interstitialAd7.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd8 = new InterstitialAd(this, "986424201853483_986426055186631");
        interstitialAd8.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd9 = new InterstitialAd(this, "986424201853483_986426348519935");
        interstitialAd9.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd10 = new InterstitialAd(this, "986424201853483_986426488519921");
        interstitialAd10.loadAd();










        mof = findViewById(R.id.mof);
        miw = findViewById(R.id.miw);
        le = findViewById(R.id.le);
        q1 = findViewById(R.id.q1);
        ne = findViewById(R.id.ne);
        q2 = findViewById(R.id.q2);
        hw = findViewById(R.id.hw);
        mw = findViewById(R.id.mw);
        q3 = findViewById(R.id.q3);
        wb = findViewById(R.id.wb);



        mof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isAdLoaded()) {

                    interstitialAd.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(chp1);

                }
            }
        });

        miw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd1.isAdLoaded()) {

                    interstitialAd1.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(chp1);
                }
            }
        });


        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd2.isAdLoaded()) {

                    interstitialAd2.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(chp1);

                }
            }
        });

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd3.isAdLoaded()) {

                    interstitialAd3.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(chp1);

                }
            }
        });

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd4.isAdLoaded()) {

                    interstitialAd4.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(chp1);

                }
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd5.isAdLoaded()) {

                    interstitialAd5.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main7Activity.class);
                    startActivity(chp1);
                }
            }
        });


        hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd6.isAdLoaded()) {

                    interstitialAd6.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main8Activity.class);
                    startActivity(chp1);

                }
            }
        });

        mw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd7.isAdLoaded()) {

                    interstitialAd7.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main9Activity.class);
                    startActivity(chp1);
                }
            }
        });


        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd8.isAdLoaded()) {

                    interstitialAd8.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main10Activity.class);
                    startActivity(chp1);
                }
            }
        });


        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd9.isAdLoaded()) {

                    interstitialAd9.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, WorkBook.class);
                    startActivity(chp1);

                }
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        switch (item.getItemId()) {



            case R.id.menu_item_share:

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                startActivity(Intent.createChooser(shareIntent, "Share..."));


            case R.id.menu_home:
                Intent yk = new Intent(this , MainActivity.class);
                startActivity(yk);







            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onBackPressed() {
        if (interstitialAd10.isAdLoaded()) {

            interstitialAd10.show();
        } else {
            super.onBackPressed();
        }
    }
}
