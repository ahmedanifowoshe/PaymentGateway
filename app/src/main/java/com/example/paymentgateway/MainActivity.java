package com.example.paymentgateway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(int view){
        




    }

    public void displayMessage(String Message){
        TextView cardName = (TextView) findViewById( R.id.cardName );
        TextView cardNumber = (TextView) findViewById( R.id.carddetails );
        TextView month = (TextView)findViewById( R.id.month );
        TextView year = (TextView)findViewById( R.id.year );
        TextView ccv = (TextView) findViewById( R.id.ccv );
        cardName.setText(Message);
        cardNumber.setText(Message );
        month.setText( Message );
        year.setText(Message );
        ccv.setText( Message );

    }


}
