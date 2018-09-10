package com.sopan.sms.scheduler.activity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.sopan.sms.scheduler.R;

public class SmsSchedulerPreferenceActivity extends PreferenceActivity {

    public static final String PREFERENCE_DELIVERY_REPORTS = "PREFERENCE_DELIVERY_REPORTS";
    public static final String PREFERENCE_REMINDERS = "PREFERENCE_REMINDERS";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}