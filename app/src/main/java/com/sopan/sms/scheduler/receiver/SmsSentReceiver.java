package com.sopan.sms.scheduler.receiver;

import com.sopan.sms.scheduler.service.SmsSentService;

public class SmsSentReceiver extends WakefulBroadcastReceiver {

    @Override
    protected Class getServiceClass() {
        return SmsSentService.class;
    }
}
