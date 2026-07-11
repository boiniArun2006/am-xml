package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfc implements zzdn {
    protected zzfc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdx zzd(Looper looper, @Nullable Handler.Callback callback) {
        return new zzfe(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zzc() {
        return System.nanoTime();
    }
}
