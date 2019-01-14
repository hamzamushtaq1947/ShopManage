package com.example.junaid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DryFruit extends AppCompatActivity {

    EditText tx,tx1,edd,edd1,edd2,edd3;
    TextView t;
    String ss,ss1;
    Button b;
    DatabaseReference  dbref= FirebaseDatabase.getInstance().getReference();
    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_fruit);

        initView();
        setListener();




    }



    private void initView() {

        tx=findViewById(R.id.textView10);
        tx1=findViewById(R.id.textView12);
        t=findViewById(R.id.textView13);
        b=findViewById(R.id.button4);
        edd=findViewById(R.id.editText3);
        edd1=findViewById(R.id.editText4);
        edd2=findViewById(R.id.editText5);
        edd3=findViewById(R.id.editText6);

        //ss=getIntent().getExtras().getString("value");
        //ss1=getIntent().getExtras().getString("values");
        //tx.setText(ss);
        //tx1.setText(ss1);


    }
    private void setListener() {


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int a = Integer.parseInt(tx.getText().toString());
                int b = Integer.parseInt(tx1.getText().toString());
                int result=(int)a*b;
                t.setText(Integer.toString(result));
               final ProductModelClass product=new ProductModelClass(edd.getText().toString(),edd1.getText().toString(),edd2.getText().toString(),edd3.getText().toString(),tx.getText().toString(),tx1.getText().toString(),t.getText().toString());
               dbref.child("Product").push().setValue(product);
                Intent I=new Intent(DryFruit.this,Home.class);
                startActivity(I);
                // t.setText(result);
            }
        });
    }


}
