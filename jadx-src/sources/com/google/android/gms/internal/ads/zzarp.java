package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzarp {
    private final Executor zza;

    public final void zzb(zzary zzaryVar, zzash zzashVar) {
        zzaryVar.zzc("post-error");
        ((zzarn) this.zza).zza.post(new zzaro(zzaryVar, zzase.zzb(zzashVar), null));
    }

    public zzarp(Handler handler) {
        this.zza = new zzarn(this, handler);
    }

    public final void zza(zzary zzaryVar, zzase zzaseVar, Runnable runnable) {
        zzaryVar.zzp();
        zzaryVar.zzc("post-response");
        ((zzarn) this.zza).zza.post(new zzaro(zzaryVar, zzaseVar, runnable));
    }
}
