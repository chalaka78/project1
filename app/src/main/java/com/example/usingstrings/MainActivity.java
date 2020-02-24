package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
        Log.d("LifeCycle", "onCreate invoked!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart invoked!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume invoked!");
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),ActivityOne.class);
                startActivity(intent);
            }
        });

    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause invoked!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop invoked!");
    }


}
