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
import com.example.paytminsider.model.PopularItem;

import java.util.List;

public class PopularEventsAdapter extends RecyclerView.Adapter<PopularEventsAdapter.ViewHolder> {

    private List<PopularItem> popularItems;
    private Context context;

    public PopularEventsAdapter(Context context, List<PopularItem> popularItems) {
        this.context = context;
        this.popularItems = popularItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.activity_featured_events, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        try {
            Glide.with(context).load(popularItems.get(position).getHorizontalCoverImage())
                    .into(holder.eventImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.eventName.setText(popularItems.get(position).getName());
        holder.categoryName.setText(popularItems.get(position).getCategoryId().getName());
        holder.venueDate.setText(popularItems.get(position).getVenueDateString());
        holder.venueName.setText(popularItems.get(position).getVenueName());
        holder.minPrice.setText(context.getResources().getString(R.string.rupees) + popularItems.get(position).getPriceDisplayString());

    }

    @Override
    public int getItemCount() {
        return popularItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView eventImageView;
        private TextView eventName;
        private TextView categoryName;
        private TextView venueDate;
        private TextView venueName;
        private TextView minPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            eventImageView = itemView.findViewById(R.id.eventImageView);
            eventName = itemView.findViewById(R.id.eventName);
            categoryName = itemView.findViewById(R.id.categoryName);
            venueDate = itemView.findViewById(R.id.venueDate);
            venueName = itemView.findViewById(R.id.venueName);
            minPrice = itemView.findViewById(R.id.minPrice);
        }
    }
}
