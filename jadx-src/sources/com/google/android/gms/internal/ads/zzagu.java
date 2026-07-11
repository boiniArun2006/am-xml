package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagu implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagu(int i2, int i3, int i5, int i7) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1751742049;
    }

    public static zzagu zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagu(iZzC, iZzC2, iZzC3, iZzC4);
    }
}
