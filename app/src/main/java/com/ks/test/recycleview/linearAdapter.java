package com.ks.test.recycleview;

        import android.content.Context;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.ks.test.R;

        import java.util.List;

/**
 * Created by AKADHP on 2020/1/12.
 */

public class linearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private  OnItemClickListener mlistener;
    private List<String> list;
    public linearAdapter(Context context,OnItemClickListener listener){
        this.mlistener = listener;
        this.mContext=  context;

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType==0){
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));


        }else{

            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item_2,parent,false));


        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if(getItemViewType(position)==0){


            ((LinearViewHolder)holder).textView.setText("hello world!");

        }else{


            ((LinearViewHolder2)holder).textView.setText("hello world2222!");
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mlistener.onClick(position);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{


        private TextView textView;
        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }


    class LinearViewHolder2 extends RecyclerView.ViewHolder{


        private TextView textView;
        private ImageView imageView;
        public LinearViewHolder2(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_image);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position%2==0){

            return 0;
        }
        else{

            return 1;
        }
    }

    public interface OnItemClickListener{

        void onClick(int pos);
    }
}
