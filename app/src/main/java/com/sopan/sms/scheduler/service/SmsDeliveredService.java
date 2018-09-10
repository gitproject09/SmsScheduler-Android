package com.sopan.sms.scheduler.service;

import android.content.Intent;

import com.sopan.sms.scheduler.helper.DbHelper;
import com.sopan.sms.scheduler.helper.SmsModel;
import com.sopan.sms.scheduler.receiver.WakefulBroadcastReceiver;

public class SmsDeliveredService extends SmsIntentService {

    public SmsDeliveredService() {
        super("SmsDeliveredService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        super.onHandleIntent(intent);
        if (timestampCreated == 0) {
            return;
        }
        SmsModel sms = DbHelper.getDbHelper(this).get(timestampCreated);
        sms.setStatus(SmsModel.STATUS_DELIVERED);
        DbHelper.getDbHelper(this).save(sms);
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
