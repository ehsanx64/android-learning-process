package net.ehsanm.learningprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.ehsanm.samplelib.SampleLibrary;
import net.ehsanm.libjava.LibJava;

public class MainActivity extends AppCompatActivity {
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
    }
}
