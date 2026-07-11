package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgwa extends zzguf {
    static final zzguf zza = new zzgwa(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgrc.zzm(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i2) {
        Object[] objArr2 = this.zzb;
        int i3 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    zzgwa(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }
}
