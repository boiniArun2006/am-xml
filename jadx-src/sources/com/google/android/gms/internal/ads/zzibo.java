package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzibo implements zzibf {
    final int zza;
    final zzies zzb;
    final boolean zzc;
    final boolean zzd;

    zzibo(zzibw zzibwVar, int i2, zzies zziesVar, boolean z2, boolean z3) {
        this.zza = i2;
        this.zzb = zziesVar;
        this.zzc = z2;
        this.zzd = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zzies zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zze() {
        return this.zzd;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzibo) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zziet zzc() {
        return this.zzb.zza();
    }
}
