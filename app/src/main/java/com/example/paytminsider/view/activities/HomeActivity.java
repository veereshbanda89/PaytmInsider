package com.example.paytminsider.view.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paytminsider.R;
import com.example.paytminsider.adapter.AllEventsListAdapter;
import com.example.paytminsider.adapter.FeaturedEventsAdapter;
import com.example.paytminsider.adapter.PopularEventsAdapter;
import com.example.paytminsider.constants.Util;
import com.example.paytminsider.listeners.ApiFailureListener;
import com.example.paytminsider.model.BannersItem;
import com.example.paytminsider.model.EventsResponse;
import com.example.paytminsider.model.FeaturedItem;
import com.example.paytminsider.model.PopularItem;
import com.example.paytminsider.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements ApiFailureListener {

    private HomeViewModel viewModel;
    private ProgressBar progressBar;
    private RecyclerView featuredEventsRecyclerView;
    private RecyclerView popularEventsRecyclerView;
    private RecyclerView exploreRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        displayToolBar();
        progressBar = findViewById(R.id.progressBar);
        featuredEventsRecyclerView = findViewById(R.id.featuredEventsRecyclerView);
        popularEventsRecyclerView = findViewById(R.id.popularEventsRecyclerView);
        exploreRecyclerView = findViewById(R.id.exploreRecyclerView);

        viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        viewModel.apiFailureListener = this;

        if (!Util.isNetworkAvailable(getApplicationContext())) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.no_internet_connection), Toast.LENGTH_LONG).show();
        } else {
            callHomePageApi();
        }

    }

    private void callHomePageApi() {
        progressBar.setVisibility(View.VISIBLE);
        viewModel.eventsResponse().observe(this, new Observer<EventsResponse>() {
            @Override
            public void onChanged(EventsResponse eventsResponse) {
                progressBar.setVisibility(View.GONE);
                if (eventsResponse != null) {
                    setFeaturedEventsList(eventsResponse.getFeatured());
                    setPopularEventsList(eventsResponse.getPopular());
                    setExploreList(eventsResponse.getBanners());
                }
            }
        });
    }

    private void setExploreList(ArrayList<BannersItem> banners) {
        AllEventsListAdapter allEventsListAdapter = new AllEventsListAdapter(getApplicationContext(), banners);
        exploreRecyclerView.setHasFixedSize(true);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        exploreRecyclerView.setLayoutManager(verticalLayoutManager);
        exploreRecyclerView.setItemAnimator(new DefaultItemAnimator());
        exploreRecyclerView.setAdapter(allEventsListAdapter);
    }

    private void setPopularEventsList(List<PopularItem> popularEventsList) {
        PopularEventsAdapter popularEventsAdapter = new PopularEventsAdapter(getApplicationContext(), popularEventsList);
        popularEventsRecyclerView.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        popularEventsRecyclerView.setLayoutManager(horizontalLayoutManager);
        popularEventsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        popularEventsRecyclerView.setAdapter(popularEventsAdapter);
    }

    private void setFeaturedEventsList(List<FeaturedItem> featuredEventsList) {
        FeaturedEventsAdapter featuredEventsAdapter = new FeaturedEventsAdapter(getApplicationContext(), featuredEventsList);
        featuredEventsRecyclerView.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        featuredEventsRecyclerView.setLayoutManager(horizontalLayoutManager);
        featuredEventsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        featuredEventsRecyclerView.setAdapter(featuredEventsAdapter);
    }

    public void displayToolBar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
    }

    @Override
    public void apiFailureResponse(String message) {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
