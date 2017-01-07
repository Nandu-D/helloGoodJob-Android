package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainbutton = (Button) findViewById(R.id.mybutton);

        mainbutton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView mymessage = (TextView) findViewById(R.id.mymessage);
                        mymessage.setText("Good Job");
                    }

        }
        );
    }
}
