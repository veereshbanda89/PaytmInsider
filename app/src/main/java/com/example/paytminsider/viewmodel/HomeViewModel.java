package com.example.paytminsider.viewmodel;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.paytminsider.listeners.ApiFailureListener;
import com.example.paytminsider.model.EventsResponse;
import com.example.paytminsider.listeners.ApiCallsInterface;

import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<EventsResponse> getEventsResponse;
    private Context context;
    private HomeModel homeModel;
    private static final String TAG = "HomeViewModel";
    public ApiFailureListener apiFailureListener;

    public HomeViewModel() {
        homeModel = new HomeModel();
    }

    public MutableLiveData<EventsResponse> eventsResponse() {
        getEventsResponse = new MutableLiveData<>();
        homeModel.getResponse(new ApiCallsInterface() {
            @Override
            public void getEventsResponse(Response<EventsResponse> eventsResponseCallback) {
                Log.i(TAG, "getEventsResponse: "+ eventsResponseCallback.body().toString());
                getEventsResponse.postValue(eventsResponseCallback.body());
            }

            @Override
            public void apiFailureResponse(String message) {
                apiFailureListener.apiFailureResponse(message);
            }
        });
        return getEventsResponse;
    }

}
