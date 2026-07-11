package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfp {
    private boolean zza;

    public final void zza(boolean z2) {
        if (this.zza == z2) {
            return;
        }
        this.zza = z2;
    }

    public zzfp(Context context, Looper looper, zzdn zzdnVar) {
        context.getApplicationContext();
        zzdnVar.zzd(looper, null);
        zzdnVar.zzd(Looper.getMainLooper(), null);
    }
}
