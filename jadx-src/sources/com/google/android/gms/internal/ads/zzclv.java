package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzclv {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzclv(int i2, int i3, int i5) {
        this.zzc = i2;
        this.zzb = i3;
        this.zza = i5;
    }

    public static zzclv zzb() {
        return new zzclv(0, 0, 0);
    }

    public static zzclv zzc(int i2, int i3) {
        return new zzclv(1, i2, i3);
    }

    public static zzclv zzd() {
        return new zzclv(4, 0, 0);
    }

    public static zzclv zze() {
        return new zzclv(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }

    public static zzclv zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzclv(3, 0, 0) : zzrVar.zzi ? new zzclv(2, 0, 0) : zzrVar.zzh ? new zzclv(0, 0, 0) : new zzclv(1, zzrVar.zzf, zzrVar.zzc);
    }
}
