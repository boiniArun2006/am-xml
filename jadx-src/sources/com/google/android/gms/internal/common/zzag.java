package com.google.android.gms.internal.common;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzag extends zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzah zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzr.zzb(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: zzi */
    public final zzah subList(int i2, int i3) {
        zzr.zzd(i2, i3, this.zzb);
        int i5 = this.zza;
        return this.zzc.subList(i2 + i5, i3 + i5);
    }

    zzag(zzah zzahVar, int i2, int i3) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
