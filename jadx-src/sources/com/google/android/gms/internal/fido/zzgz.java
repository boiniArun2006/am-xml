package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzgz extends zzhb {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzgz(byte[] bArr, int i2, int i3, boolean z2, zzgy zzgyVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i2) throws zzhd {
        int i3 = this.zze;
        this.zze = 0;
        int i5 = this.zzc + this.zzd;
        this.zzc = i5;
        if (i5 <= 0) {
            this.zzd = 0;
            return i3;
        }
        this.zzd = i5;
        this.zzc = 0;
        return i3;
    }
}
