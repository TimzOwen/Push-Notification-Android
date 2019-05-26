package com.example.pushnotificationdemo;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstaceIdService extends FirebaseMessagingService
{

    //get latest messaqge on refresh

    @Override
    public void onNewToken(String s)
    {
        String recentToken = FirebaseInstanceId.getInstance().getToken();
    }
}
