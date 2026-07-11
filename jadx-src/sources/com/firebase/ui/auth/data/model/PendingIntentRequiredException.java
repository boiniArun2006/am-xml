package com.firebase.ui.auth.data.model;

import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.FirebaseUiException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class PendingIntentRequiredException extends FirebaseUiException {
    private final IntentSender mIntentSender;
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentRequiredException(@NonNull PendingIntent pendingIntent, int i2) {
        super(0);
        this.mPendingIntent = pendingIntent;
        this.mIntentSender = null;
        this.mRequestCode = i2;
    }

    public PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public PendingIntentRequiredException(@NonNull IntentSender intentSender, int i2) {
        super(0);
        this.mIntentSender = intentSender;
        this.mPendingIntent = null;
        this.mRequestCode = i2;
    }
}
