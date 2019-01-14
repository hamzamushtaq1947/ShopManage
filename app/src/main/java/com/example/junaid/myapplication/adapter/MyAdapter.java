package com.example.junaid.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.junaid.myapplication.DryFruit;
import com.example.junaid.myapplication.R;

/**
 * Created by Junaid on 1/5/2019.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private Context context;
    private int images[];
    private String names[];
    public int  quant=100;
    private String price[];
    private String ss,st;

    public MyAdapter(Context context, int[] images, String[] names,String[]price) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.price=price;
    }






    @Override
    public MyHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View layout= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_layout,null);
        MyHolder myholder=new MyHolder(layout);
        return myholder;
    }

    @Override
    public void onBindViewHolder(MyHolder viewHolder, final int i) {
            viewHolder.img.setImageResource(images[i]);
            viewHolder.tx.setText(names[i]);
            viewHolder.tx4.setText(price[i]);
        viewHolder.tx3.setText(Integer.toString(quant));

        ss=viewHolder.tx3.getText().toString();
        st=viewHolder.tx4.getText().toString();

        viewHolder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                if(i==0)
                {


                    Intent intent= new Intent(context, DryFruit.class);


                    //intent.putExtra("values",st);
                    //intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==1)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);

                }
                if(i==3)
                {


                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==4)
                {


                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==5)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==6)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==7)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==8)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }
                if(i==9)
                {

                    Intent intent= new Intent(context, DryFruit.class);


                    intent.putExtra("values",st);
                    intent.putExtra("value",ss);
                    context.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }
    public static class MyHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tx,tx1,tx2,tx3,tx4;
        Button b;
        public MyHolder( View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.imageView3);
            tx=(TextView)itemView.findViewById(R.id.textView5);
            b=(Button) itemView.findViewById(R.id.button3);
            tx1=(TextView)itemView.findViewById(R.id.textView4);
            tx2=(TextView)itemView.findViewById(R.id.textView6);
            tx3=(TextView)itemView.findViewById(R.id.textView7);
            tx4=(TextView)itemView.findViewById(R.id.textView8);

        }
    }
}
