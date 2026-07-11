package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzefu {
    private final zzcma zza;
    private final Context zzb;
    private final Executor zzc;

    zzefu(zzcma zzcmaVar, Context context, Executor executor) {
        this.zza = zzcmaVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzefw zzefwVarZzh = this.zza.zzh();
        zzefwVarZzh.zzb(this.zzb);
        zzefwVarZzh.zza().zza().zza();
    }
}
