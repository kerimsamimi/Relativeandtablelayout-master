package com.example.kerim.relativeandtablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    EditText et1, et2;
    Button b2, b1, b3, b4;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText1);
        b2 = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button1);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.button2:
                b2.setText(et1.getText().toString());
                break;
            case R.id.button1:
                b1.setText(b2.getText().toString());
                break;
            case R.id.button3:
                b2.setText("Kerim Samimi - 130320014");
                break;
            case R.id.button4:
                toast= Toast.makeText(getApplicationContext(), "Ödev Tamamlandı.", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
        }




    }
}
