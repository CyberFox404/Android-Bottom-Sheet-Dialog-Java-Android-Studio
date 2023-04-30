package com.codewithgolap.bottomsheetdialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.xmlpull.v1.XmlPullParser;

public class bottomSheet {
    Context context;
    MainActivity mainActivity;

    public bottomSheet(Context context, MainActivity mainActivity){
        this.context = context;
        this.mainActivity = mainActivity;
    }

    public void Short( View showBottomSheet, int layout){

        showBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        mainActivity, R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(context)
                        .inflate(layout,
                                (LinearLayout) view.findViewById(R.id.bottomSheetContainer));
                bottomSheetView.findViewById(R.id.shareButton).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mainActivity, "Shared!!!", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
    }




}
