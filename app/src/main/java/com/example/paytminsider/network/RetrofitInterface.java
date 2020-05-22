package com.example.paytminsider.network;

import com.example.paytminsider.model.EventsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("home")
    Call<EventsResponse> getEventsResponse(@Query("norm") int norm, @Query("filterBy") String filterBy, @Query("city") String cityName);
}