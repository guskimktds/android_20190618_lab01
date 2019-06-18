package com.raccoon.gus.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Button button = (Button) findViewById(R.id.button);
//
////        button.setOnClickListener(
////                new Button.OnClickListener() {
////                    public void onClick(View v) {
////                        Toast.makeText(MainActivity.this, "테스트 메시지입니다.", Toast.LENGTH_SHORT).show();
////                    }
////                }
////        );
//
//        public void button.onButton1Clicked(View view){
//            Toast.makeText(getApplicationContext(), "버튼 1 눌림", Toast.LENGTH_LONG).show();
//        }


    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(), "버튼이 눌렸어요", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.daum.net"));

        startActivity(intent);
    }
}
