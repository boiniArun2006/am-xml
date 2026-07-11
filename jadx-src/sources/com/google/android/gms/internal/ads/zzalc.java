package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;

    @Nullable
    public final long[] zzi;

    @Nullable
    public final long[] zzj;
    public final int zzk;

    @Nullable
    private final zzald[] zzl;

    public zzalc(int i2, int i3, long j2, long j3, long j4, long j5, zzv zzvVar, int i5, @Nullable zzald[] zzaldVarArr, int i7, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = zzvVar;
        this.zzh = i5;
        this.zzl = zzaldVarArr;
        this.zzk = i7;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzalc zzb(zzv zzvVar) {
        return new zzalc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    @Nullable
    public final zzald zza(int i2) {
        return this.zzl[i2];
    }
}
