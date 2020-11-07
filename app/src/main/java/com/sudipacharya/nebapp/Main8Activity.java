package com.sudipacharya.nebapp;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main8Activity extends AppCompatActivity {

    private TextView url;
    private WebView webview;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference reference = firebaseDatabase.getReference();
    private DatabaseReference childreference1 = reference.child("howurl1");
    private DatabaseReference childreference2 = reference.child("howurl2");
    private DatabaseReference childreference3 = reference.child("howurl3");
    private DatabaseReference childreference4 = reference.child("howurl4");
    private DatabaseReference childreference5 = reference.child("howurl5");
    private DatabaseReference childreference6 = reference.child("howurl6");
    private DatabaseReference childreference7 = reference.child("howurl7");
    private DatabaseReference childreference8 = reference.child("howurl8");
    private DatabaseReference childreference9 = reference.child("howurl9");
    private DatabaseReference childreference10 = reference.child("howurl10");
    private DatabaseReference childreference11 = reference.child("howurl11");
    private DatabaseReference childreference12 = reference.child("howurl12");
    private DatabaseReference childreference13 = reference.child("howurl13");
    private DatabaseReference childreference14 = reference.child("howurl14");
    private DatabaseReference childreference15 = reference.child("howurl15");
    private DatabaseReference childreference16 = reference.child("howurl16");
    private DatabaseReference childreference17 = reference.child("howurl17");
    private DatabaseReference childreference18 = reference.child("howurl18");
    private DatabaseReference childreference19 = reference.child("howurl19");
    private DatabaseReference childreference20 = reference.child("howurl20");
    private DatabaseReference childreference21 = reference.child("howurl21");
    private DatabaseReference childreference22 = reference.child("howurl22");
    private DatabaseReference childreference23 = reference.child("howurl23");
    private DatabaseReference childreference24 = reference.child("howurl24");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button chapter1 = findViewById(R.id.chapter1);
        Button chapter2 = findViewById(R.id.chapter2);
        Button chapter3 = findViewById(R.id.chapter3);
        Button chapter4 = findViewById(R.id.chapter4);
        Button chapter5 = findViewById(R.id.chapter5);
        Button chapter6 = findViewById(R.id.chapter6);
        Button chapter7 = findViewById(R.id.chapter7);
        Button chapter8 = findViewById(R.id.chapter8);
        Button chapter9 = findViewById(R.id.chapter9);
        Button chapter10 = findViewById(R.id.chapter10);
        Button chapter11 = findViewById(R.id.chapter11);
        Button chapter12 = findViewById(R.id.chapter12);
        Button chapter13 = findViewById(R.id.chapter13);
        Button chapter14 = findViewById(R.id.chapter14);
        Button chapter15 = findViewById(R.id.chapter15);
        Button chapter16 = findViewById(R.id.chapter16);
        Button chapter17 = findViewById(R.id.chapter17);
        Button chapter18 = findViewById(R.id.chapter18);
        Button chapter19 = findViewById(R.id.chapter19);
        Button chapter20 = findViewById(R.id.chapter20);
        Button chapter21 = findViewById(R.id.chapter21);
        Button chapter22 = findViewById(R.id.chapter22);
        Button chapter23 = findViewById(R.id.chapter23);
        Button chapter24 = findViewById(R.id.chapter24);



        url= (TextView) findViewById(R.id.url);
        webview=(WebView) findViewById(R.id.webview);
        webview = (WebView) findViewById(R.id.webview);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
            webview.getSettings().setAppCacheMaxSize( 5 * 1024 * 1024 ); // 5MB
        }
        webview.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
        webview.getSettings().setAllowFileAccess( true );
        webview.getSettings().setAppCacheEnabled( true );
        webview.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT );

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());

        if ( !isNetworkAvailable() ) { // loading offline
            webview.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );

        }



        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference7.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference8.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference9.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference10.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference11.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference12.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference13.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference14.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference15.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference16.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference17.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference18.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference19.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference20.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference21.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference22.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference23.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        chapter24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setVisibility(webview.VISIBLE);
                childreference24.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String message = dataSnapshot.getValue(String.class);
                        url.getText();
                        webview.loadUrl(message);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });









    }



    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService( CONNECTIVITY_SERVICE );
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();


    }

    @Override
    public void onBackPressed() {
        if (webview.getVisibility() == View.VISIBLE){
            webview.setVisibility(webview.GONE);
        }else{

            super.onBackPressed();
        }}



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

}
