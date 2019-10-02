package com.example.retrofitmodel.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitmodel.DataModel;
import com.example.retrofitmodel.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    private List<DataModel> modelList;
    private Context context;


    public DataAdapter(List<DataModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.row_card,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(modelList.get(i).getTitle());
        Picasso.get().load(modelList.get(i).getThumbnailUrl()).into(myViewHolder.profile);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView profile;
        View v;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show();
                }
            });
            title = v.findViewById(R.id.titleofpost);
            profile = v.findViewById(R.id.profileimage);
        }
    }
}
