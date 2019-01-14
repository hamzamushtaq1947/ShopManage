package com.example.junaid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.junaid.myapplication.adapter.MyAdapter;

public class Home extends AppCompatActivity {
    RecyclerView recycle;
    GridLayoutManager LayoutManager;
    String st,st1;
    private String nameList[]={"Rice","DryFruits","Cosmetics","Beverages","Milk","Shampoo","Biscuits","Chocolates","IceCream","Breads"};
    private  String price[]={"100","200","300","400","500","100","700","800","900","1000"};

    private int iconList[]={R.drawable.rice,R.drawable.aa,R.drawable.cosm,R.drawable.q,R.drawable.m,R.drawable.s,R.drawable.bis,R.drawable.untitled,R.drawable.ice,R.drawable.bread};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recycle=findViewById(R.id.recycler);
        LayoutManager=new GridLayoutManager(Home.this,2);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(LayoutManager);
        MyAdapter myadapter=new MyAdapter(Home.this,iconList,nameList,price);
        recycle.setAdapter(myadapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.acc)
        {
            Intent I=new Intent(Home.this,Beverages.class);
            startActivity(I);
            return true;
        }
        if(id==R.id.priv)
        {
            Intent I=new Intent(Home.this,Beverages.class);
            st=getIntent().getExtras().getString("values");
            st1=getIntent().getExtras().getString("val");
            I.putExtra("value",st);
            I.putExtra("valu",st1);
            startActivity(I);
            return true;
        }
        if(id==R.id.set)
        {
            Intent I=new Intent(Home.this,Beverages.class);
            startActivity(I);
            return true;
        }
        if(id==R.id.abt)
        {
            Intent I=new Intent(Home.this,Beverages.class);
            startActivity(I);
            return true;
        }
        if(id==R.id.lg)
        {
            Intent I=new Intent(Home.this,MainActivity.class);
            startActivity(I);
            finish();
            return true;
        }

        return true;
    }
}
