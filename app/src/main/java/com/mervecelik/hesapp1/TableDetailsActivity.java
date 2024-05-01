package com.mervecelik.hesapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TableDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_details);

        // Intent'ten masa adını al
        String tableName = getIntent().getStringExtra("TABLE_NAME");

        // Masa adını TextView'da göster
        TextView tableNameTextView = findViewById(R.id.table_name_text_view);
        tableNameTextView.setText(tableName);

        // Burada, masanın detaylarını gösterecek kodları ekleyebilirsiniz

    }
}