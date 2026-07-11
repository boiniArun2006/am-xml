package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzfyn extends Handler {
    public zzfyn() {
        Looper.getMainLooper();
    }

    public zzfyn(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    protected void zza(Message message) {
        super.dispatchMessage(message);
    }
}
