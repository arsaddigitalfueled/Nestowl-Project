package com.example.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newprojectr.R;

import java.util.ArrayList;

public class CardAdapterAmenties extends RecyclerView.Adapter<CardAdapterAmenties.Holder> {



    Context context;
    ArrayList<Integer> firstlist;
    ArrayList<String> secondlist;


    public CardAdapterAmenties(Context context, ArrayList<Integer> firstlist, ArrayList<String> secondlist) {
        this.context = context;
        this.firstlist = firstlist;
        this.secondlist = secondlist;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.card_amenties_layout,parent,false);
        Holder holder= new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.imageView.setImageResource(firstlist.get(position));
        holder.textView.setText(secondlist.get(position));

    }

    @Override
    public int getItemCount() {
        return firstlist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        public Holder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.card_image);
            textView = (TextView) itemView.findViewById(R.id.card_tv);
        }
    }
}
