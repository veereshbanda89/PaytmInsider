package com.example.paytminsider.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.paytminsider.R;
import com.example.paytminsider.model.BannersItem;

import java.util.List;

public class AllEventsListAdapter extends RecyclerView.Adapter<AllEventsListAdapter.ViewHolder> {

    private List<BannersItem> bannersItems;
    private Context context;

    public AllEventsListAdapter(Context context, List<BannersItem> bannersItems) {
        this.context = context;
        this.bannersItems = bannersItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.content_all_events, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        try {
            Glide.with(context).load(bannersItems.get(position).getVerticalCoverImage())
                    .into(holder.eventImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.eventName.setText(bannersItems.get(position).getName());
        holder.categoryName.setText(bannersItems.get(position).getCategoryId().getName());
    }

    @Override
    public int getItemCount() {
        return bannersItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView eventImageView;
        private TextView eventName;
        private TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            eventImageView = itemView.findViewById(R.id.eventImageView);
            eventName = itemView.findViewById(R.id.eventName);
            categoryName = itemView.findViewById(R.id.categoryName);
        }
    }
}
