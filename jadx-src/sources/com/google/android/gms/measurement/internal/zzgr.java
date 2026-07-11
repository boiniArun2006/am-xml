package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgr {
    final /* synthetic */ zzgt zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public final void zza(String str) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }

    zzgr(zzgt zzgtVar, int i2, boolean z2, boolean z3) {
        Objects.requireNonNull(zzgtVar);
        this.zza = zzgtVar;
        this.zzb = i2;
        this.zzc = z2;
        this.zzd = z3;
    }
}
