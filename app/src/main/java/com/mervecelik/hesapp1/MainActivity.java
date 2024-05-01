package com.mervecelik.hesapp1;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.SharedPreferences;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Kullanıcının tema tercihini yükle ve uygula
        SharedPreferences sharedPreferences = getSharedPreferences("ThemePreferences", MODE_PRIVATE);
        int themeMode = sharedPreferences.getInt("ThemeMode", AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        AppCompatDelegate.setDefaultNightMode(themeMode);

        setContentView(R.layout.activity_main);
        // Tema değiştirme anahtarını ayarla
        SwitchCompat themeSwitch = findViewById(R.id.theme_switch);
        themeSwitch.setChecked(themeMode == AppCompatDelegate.MODE_NIGHT_YES);
        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    saveThemePreference(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    saveThemePreference(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });
    }

    private void saveThemePreference(int themeMode) {
        SharedPreferences sharedPreferences = getSharedPreferences("ThemePreferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("ThemeMode", themeMode);
        editor.apply();
    }





    public void onGarsonClicked(View view){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }

    public void onMudurClicked(View view){
        Intent intent = new Intent(this, TablesActivity.class);
        startActivity(intent);
    }
    public void onCikisClicked(View view) {
        finish(); // Bu aktiviteyi sonlandırır ve uygulamadan çıkar
}}