package com.sopan.sms.scheduler.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.sopan.sms.scheduler.helper.DbHelper;

abstract public class SmsIntentService extends IntentService {

    protected long timestampCreated;

    public SmsIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(getClass().getName(), "Handling intent");
        timestampCreated = intent.getLongExtra(DbHelper.COLUMN_TIMESTAMP_CREATED, 0L);
        if (timestampCreated == 0) {
            Log.i(getClass().getName(), "Cannot identify sms: no creation timestamp provided");
        }
    }
}
