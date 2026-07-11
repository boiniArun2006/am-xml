package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i2) {
        zzgrc.zzi(!this.zzb);
        this.zza.append(i2, true);
        return this;
    }

    public final zzs zzb() {
        zzgrc.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
