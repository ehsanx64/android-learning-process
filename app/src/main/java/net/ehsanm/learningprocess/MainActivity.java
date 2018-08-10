package net.ehsanm.learningprocess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.ehsanm.samplelib.SampleLibrary;
import net.ehsanm.libjava.LibJava;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.default_text_view);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(LibJava.getDefaultMessage());
            }
        });

        // Get and set click listener for webview button
        Button webViewButton = findViewById(R.id.btn_switchWebView);
        webViewButton.setOnClickListener(this);
    }

    // In order to be able to override this method (and use it) the activity (current activity)
    // must implement View.OnClickListener
    @Override
    public void onClick(View v) {
        // Check the event view and handle it
        switch (v.getId()) {
            case R.id.btn_switchWebView:
                // Start WebView's main activity
                Intent intent = new Intent(MainActivity.this, Part_WebView_Main.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
