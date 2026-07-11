package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzdk extends zzco {
    static final zzco zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final Object[] zzg() {
        return this.zzb;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzbe.zza(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj
    final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    zzdk(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }
}
