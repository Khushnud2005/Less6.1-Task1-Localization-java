package uz.exemple.less61_task1_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import uz.exemple.less61_task1_java.activity.LanguageActivity;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        context = this;
        Button b_home = findViewById(R.id.b_home);
        b_home.setText(getString(R.string.app_name));

        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLanguageActivity();
            }
        });
    }



    void callLanguageActivity() {
        Intent intent = new Intent(context, LanguageActivity.class);
        startActivity(intent);
    }


}