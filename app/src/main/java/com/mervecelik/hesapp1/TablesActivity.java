package com.mervecelik.hesapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TablesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        // Masaları yükleyin veya API'den çekin
    }

    public void onTableClicked(View view) {
        // Tıklanan masa numarasını al
        Button tableButton = (Button) view;
        String tableName = tableButton.getText().toString();

        // İlgili masa detaylarını gösteren aktiviteyi başlat
        Intent intent = new Intent(this, TableDetailsActivity.class);
        intent.putExtra("TABLE_NAME", tableName);
        startActivity(intent);
    } }
