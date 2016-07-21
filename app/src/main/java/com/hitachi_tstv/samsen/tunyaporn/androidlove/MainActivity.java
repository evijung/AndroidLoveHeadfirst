package com.hitachi_tstv.samsen.tunyaporn.androidlove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Explicit
    TextView detailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget
        detailTextView = (TextView) findViewById(R.id.txtDetail);

    }

    public void btnClickMeClicked(View view) {

        detailTextView.setVisibility(View.VISIBLE);

    }
}
