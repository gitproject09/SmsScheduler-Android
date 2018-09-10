package com.sopan.sms.scheduler.receiver;

import com.sopan.sms.scheduler.service.SmsDeliveredService;

public class SmsDeliveredReceiver extends WakefulBroadcastReceiver {

    @Override
    protected Class getServiceClass() {
        return SmsDeliveredService.class;
    }
}
