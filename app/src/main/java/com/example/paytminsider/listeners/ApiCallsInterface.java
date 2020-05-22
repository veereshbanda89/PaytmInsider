package com.example.paytminsider.listeners;

import androidx.lifecycle.LiveData;

import com.example.paytminsider.model.EventsResponse;


import retrofit2.Callback;
import retrofit2.Response;

public interface ApiCallsInterface {

    public void getEventsResponse(Response<EventsResponse> eventsResponseCallback);

    public void apiFailureResponse(String message);
}

