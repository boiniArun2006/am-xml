package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final /* synthetic */ class zzen implements Runnable {
    private final /* synthetic */ zzeo zza;
    private final /* synthetic */ Context zzb;

    /* synthetic */ zzen(zzeo zzeoVar, Context context) {
        this.zza = zzeoVar;
        this.zzb = context;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.zza.zza.zzd(this.zzb);
    }
}
