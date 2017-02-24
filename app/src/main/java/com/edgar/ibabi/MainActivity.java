package com.edgar.ibabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view){
        EditText e=(EditText)findViewById(R.id.one);
        TextView t=(TextView)findViewById(R.id.ed);

        String msg=e.getText().toString();

        if(msg.length()<8){

            t.setText("you have to enter atleast 7 characters");

        }else{
            Intent i=new Intent(this,Leaf.class);
            startActivity(i);
        }
    }
}
