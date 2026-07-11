package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzikr {
    private final List zza;
    private final List zzb;

    public final zzikr zza(zzikp zzikpVar) {
        this.zza.add(zzikpVar);
        return this;
    }

    public final zzikr zzb(zzikp zzikpVar) {
        this.zzb.add(zzikpVar);
        return this;
    }

    public final zziks zzc() {
        return new zziks(this.zza, this.zzb, null);
    }

    /* synthetic */ zzikr(int i2, int i3, zzikq zzikqVar) {
        this.zza = zzikd.zza(i2);
        this.zzb = zzikd.zza(i3);
    }
}
