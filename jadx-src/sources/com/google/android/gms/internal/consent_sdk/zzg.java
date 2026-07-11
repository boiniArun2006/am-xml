package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzg(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = i2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.zza, super.getMessage());
    }
}
