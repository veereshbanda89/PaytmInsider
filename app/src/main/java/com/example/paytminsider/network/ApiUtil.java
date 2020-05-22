package com.example.paytminsider.network;

import com.example.paytminsider.constants.Constants;

public class ApiUtil {
    public static RetrofitInterface getEventsResponse() {
        return RetrofitClient.getClient(Constants.HOME_PAGE_API).create(RetrofitInterface.class);
    }
}
