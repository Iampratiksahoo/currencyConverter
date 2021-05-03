package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    public void convertCall(View view)
    {

        Log.i("Info","Button Working !!");

        EditText userEditText = (EditText)findViewById(R.id.userEditText);

        float dollarFetched = Float.valueOf(userEditText.getText().toString());
        float Rupee = (float) (dollarFetched * 74.93);

        Toast.makeText(this, "$"+dollarFetched+" is Equal to ₹"+Rupee, Toast.LENGTH_SHORT).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}