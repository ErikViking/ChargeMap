package com.example.chargemap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuActivity extends Activity implements OnClickListener {

    Button buttonSQL, navigationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linLayout = new LinearLayout(this);
        linLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams linLayoutParam = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT); 
        setContentView(linLayout, linLayoutParam);

        buttonSQL = new Button(this);
        buttonSQL.setText("SQL Administration");
        buttonSQL.setOnClickListener(this);
        linLayout.addView(buttonSQL);
        
        navigationButton = new Button(this);
        navigationButton.setText("Navigation");
        navigationButton.setOnClickListener(this);
        linLayout.addView(navigationButton);
    }

    public void onClick(View v) {
        Log.d("Default", "A button in MenuActivity was clicked");
        if (v == buttonSQL) {
            Intent i = new Intent(this, SQLMenu.class);
            startActivity(i);
        }
        if (v == navigationButton) {
            Intent i = new Intent(this, MapActivity.class);
            startActivity(i);
        }
    }
}

