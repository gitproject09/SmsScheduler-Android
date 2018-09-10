package com.sopan.sms.scheduler.receiver;

import com.sopan.sms.scheduler.service.ReminderService;

public class ReminderReceiver extends WakefulBroadcastReceiver {

    @Override
    protected Class getServiceClass() {
        return ReminderService.class;
    }
}
