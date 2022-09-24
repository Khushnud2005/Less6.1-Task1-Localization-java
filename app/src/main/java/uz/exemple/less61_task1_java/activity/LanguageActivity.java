package uz.exemple.less61_task1_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import timber.log.Timber;
import uz.exemple.less61_task1_java.R;

public class LanguageActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        initViews();
    }
    void initViews() {
        context = this;
        Button b_english = findViewById(R.id.b_english);
        b_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("en");
            }
        });
        Button b_russian = findViewById(R.id.b_russian);
        b_russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ru");
            }
        });
        Button b_uzbek = findViewById(R.id.b_uzbek);
        b_uzbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("uz");
            }
        });
        Button b_china = findViewById(R.id.b_china);
        b_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("zh");
            }
        });
        Button b_korea = findViewById(R.id.b_korea);
        b_korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ko");
            }
        });
        Button b_japan = findViewById(R.id.b_japan);
        b_japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ja");

            }
        });


        String one = getResources().getQuantityString(R.plurals.my_cats, 1,1);

        String few = getResources().getQuantityString(R.plurals.my_cats, 2,3);

        String many = getResources().getQuantityString(R.plurals.my_cats, 5, 10);

        //Log.d("@@@one ", one);
       // Log.d("@@@few ", few);
       // Log.d("@@@many ", many);
        Timber.d(one);
        Timber.d(few);
        Timber.d(many);
    }

    public void setLocale(String lang_code) {
        Locale locale = new Locale(lang_code);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        Timber.d(lang_code);
        finish();
    }
}