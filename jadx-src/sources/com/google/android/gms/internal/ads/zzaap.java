package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzaap {
    private final Handler zza;
    private final zzaar zzb;
    private boolean zzc;

    public zzaap(Handler handler, zzaar zzaarVar) {
        this.zza = handler;
        this.zzb = zzaarVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ zzaar zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
