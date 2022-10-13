package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button end;
    final int[] voteCount = new int[6];
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        end = findViewById(R.id.end);
        Arrays.fill(voteCount, 0);
        final String[] values = {"1번", "2번", "3번", "4번", "5번", "6번"};
        Button[] buttons = new Button[6];
        int[] id = {R.id.kind1, R.id.kind2, R.id.kind3, R.id.kind4, R.id.kind5, R.id.kind6};
        for (int i = 0; i < voteCount.length; i++) {
            final int index = i;
            buttons[index] = findViewById(id[index]);
            buttons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(), values[index] + ": 총" + voteCount[index] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    public void end(View v){
        Intent intent = new Intent(getApplicationContext(), result.class);
        intent.putExtra("voteCount", voteCount);
        startActivity(intent);
    }

}