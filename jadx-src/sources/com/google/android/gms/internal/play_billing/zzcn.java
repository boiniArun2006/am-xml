package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcn extends zzco {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzco zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    zzcn(zzco zzcoVar, int i2, int i3) {
        this.zzc = zzcoVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzbe.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    /* JADX INFO: renamed from: zzi */
    public final zzco subList(int i2, int i3) {
        zzbe.zze(i2, i3, this.zzb);
        int i5 = this.zza;
        return this.zzc.subList(i2 + i5, i3 + i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
