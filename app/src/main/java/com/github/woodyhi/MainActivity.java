package com.github.woodyhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.widget.TextView;

import com.github.woodyhi.context.ContextProvider;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        BaseApplication app1 = (BaseApplication) ContextProvider.get();
        BaseApplication app2 = ContextProvider.getApplication();
        Application app3 = ContextProvider.getApplication();

        textView.append(app1 + "\n");
        textView.append(app2 + "\n");
        textView.append(app3 + "\n");
    }
}
