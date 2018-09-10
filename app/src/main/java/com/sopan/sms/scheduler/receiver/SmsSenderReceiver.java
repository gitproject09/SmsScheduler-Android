package com.sopan.sms.scheduler.receiver;

import com.sopan.sms.scheduler.service.SmsSenderService;

public class SmsSenderReceiver extends WakefulBroadcastReceiver {

    @Override
    protected Class getServiceClass() {
        return SmsSenderService.class;
    }
}
