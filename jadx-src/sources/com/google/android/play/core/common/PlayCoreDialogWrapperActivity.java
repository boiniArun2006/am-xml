package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ResultReceiver f59429n;

    private final void n() {
        ResultReceiver resultReceiver = this.f59429n;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f59429n);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && (resultReceiver = this.f59429n) != null) {
            if (i3 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i3 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f59429n = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                n();
                finish();
            } else {
                try {
                    try {
                        startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
                    } catch (IntentSender.SendIntentException unused) {
                        n();
                        finish();
                    }
                } catch (IntentSender.SendIntentException unused2) {
                }
            }
        } else {
            this.f59429n = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }
}
