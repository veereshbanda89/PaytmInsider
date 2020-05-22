package com.example.paytminsider.viewmodel;

import android.util.Log;

import com.example.paytminsider.model.EventsResponse;
import com.example.paytminsider.listeners.ApiCallsInterface;
import com.example.paytminsider.network.ApiUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeModel {

    private static final String TAG = "HomeModel";

 public void getResponse(ApiCallsInterface apiCallsInterface){

     ApiUtil.getEventsResponse().getEventsResponse(1,"go-out","mumbai").enqueue(new Callback<EventsResponse>() {
         @Override
         public void onResponse(Call<EventsResponse> call, Response<EventsResponse> response) {
             Log.i(TAG, "onResponse: "+ response.isSuccessful());
             if(response.isSuccessful()){
                 apiCallsInterface.getEventsResponse(response);
             }
         }

         @Override
         public void onFailure(Call<EventsResponse> call, Throwable t) {
             Log.i(TAG, "onFailure: "+ t.getMessage());
             apiCallsInterface.apiFailureResponse(t.getMessage());
         }
     });
 }

}
