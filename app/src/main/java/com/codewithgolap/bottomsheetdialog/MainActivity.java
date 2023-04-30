package com.codewithgolap.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    bottomSheet bottomSheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showBottomSheet = findViewById(R.id.bottomSheetDialog);
        bottomSheet = new bottomSheet(
                this,
                MainActivity.this
        );

        bottomSheet.Short(
                showBottomSheet,
                R.layout.layout_bottom_sheet
        );

    }
}