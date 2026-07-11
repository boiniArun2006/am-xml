package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzel {
    final /* synthetic */ zzep zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzek
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzej zzejVar = (zzej) this.zzb.get();
        if (zzejVar != null) {
            zzejVar.zza(this.zza.zzc());
        }
    }

    public zzel(zzep zzepVar, zzej zzejVar, Executor executor) {
        Objects.requireNonNull(zzepVar);
        this.zza = zzepVar;
        this.zzb = new WeakReference(zzejVar);
        this.zzc = executor;
    }
}
