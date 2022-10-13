package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Intent intent = getIntent();
        int[] count = intent.getIntArrayExtra("voteCount");

        TextView[] t = new TextView[count.length];
        int id[] = {R.id.result1,R.id.result2,R.id.result3,R.id.result4,R.id.result5,R.id.result6};
        for(int i=0;i<t.length;i++){
            t[i]=findViewById(id[i]);
            t[i].setText(count[i]+"명");
        }
        back=findViewById(R.id.back);
    }
    public void back(View v){
        finish();
    }
}