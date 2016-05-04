package com.acadgild.balu.acd_an_session_9_assignment_2_main;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_show_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_show_dialog = (Button) findViewById(R.id.button_show_dialog);
        btn_show_dialog.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.button_show_dialog)
        {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle(R.string.dialog_title);
            alertDialog.setMessage(R.string.dialog_message);
            alertDialog.setIcon(R.drawable.delete);
            alertDialog.setCancelable(false);


            alertDialog.setPositiveButton(R.string.dialog_positive_button,
            new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int id)
                {
                    finish();
                }
            });

            alertDialog.setNegativeButton(R.string.dialog_negative_button,
            new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int id)
                {
                    dialog.cancel();
                }
            });
            alertDialog.create();
            alertDialog.show();
        }
    }
}
