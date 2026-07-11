package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    public int getConnectionStatusCode() {
        return this.zza;
    }

    GooglePlayServicesAvailabilityException(int i2, @Nullable String str, @Nullable Intent intent) {
        super(str, intent);
        this.zza = i2;
    }
}
