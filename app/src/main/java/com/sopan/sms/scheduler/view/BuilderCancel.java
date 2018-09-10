package com.sopan.sms.scheduler.view;

import android.view.View;
import android.widget.Button;

import com.sopan.sms.scheduler.R;
import com.sopan.sms.scheduler.helper.SmsModel;

public class BuilderCancel extends Builder {

    @Override
    protected Button getView() {
        return (Button) view;
    }

    @Override
    public Button build() {
        getView().setVisibility(sms.getTimestampCreated() > 0 ? View.VISIBLE : View.GONE);
        getView().setText(sms.getStatus().contentEquals(SmsModel.STATUS_PENDING)
            ? R.string.form_button_cancel
            : R.string.form_button_delete
        );
        return getView();
    }
}
