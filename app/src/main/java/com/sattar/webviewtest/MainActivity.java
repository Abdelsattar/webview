package com.sattar.webviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.mozilla.gecko.GeckoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the GeckoView in our layout
        GeckoView geckoView = (GeckoView) findViewById(R.id.geckoview);
        geckoView.loadUri("https://www.google.com");

        // Attach the GeckoView to a new GeckoSession
//        GeckoSession session = new GeckoSession();
//        geckoView.setSession(session);
//
//        // Load a URL
//        session.loadUri("http://mozilla.com");
    }
}
