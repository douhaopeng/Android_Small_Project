package com.ks.test.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ks.test.R;

import java.util.List;

/**
 * Created by AKADHP on 2020/1/12.
 */

public class StaggerAdapter extends RecyclerView.Adapter<StaggerAdapter.LinearViewHolder> {
    private Context mContext;
    private  OnItemClickListener mlistener;
    private List<String> list;
    public StaggerAdapter(Context context, OnItemClickListener listener){
        this.mlistener = listener;
        this.mContext=  context;

    }
    @Override
    public StaggerAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_stagger_item,parent,false));
    }

    @Override
    public void onBindViewHolder(StaggerAdapter.LinearViewHolder holder, final int position) {

        if(position%2!=0){

            holder.imageView.setImageResource(R.drawable.image1);

        }
        else{

            holder.imageView.setImageResource(R.drawable.image2);

        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 80;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{


        private ImageView imageView;
        public LinearViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }

    public interface OnItemClickListener{

        void onClick(int pos);
    }
}
