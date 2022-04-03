//Design a Login Form with username and password using LinearLayout and toast valid credentials
package com.example.co1_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText ed1 = (EditText) findViewById(R.id.user);
        String user = ed1.getText().toString();
        EditText ed2 = (EditText) findViewById(R.id.pswd);
        String pswd = ed2.getText().toString();
        if(!user.equals("rony")){
            Toast t = Toast.makeText(getApplicationContext(),"Invalid Username",Toast.LENGTH_LONG);
            t.show();
        }
        else if(!pswd.equals("123456")){
            Toast t = Toast.makeText(getApplicationContext(),"Wrong password",Toast.LENGTH_LONG);
            t.show();
        }
        else{
            Toast t =  Toast.makeText(getApplicationContext(),"Sucess", Toast.LENGTH_LONG);
            t.show();
        }

    }
}