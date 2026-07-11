package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlh extends zzli {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzlh(byte[] bArr, int i2, int i3, boolean z2, byte[] bArr2) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i2) throws zzmq {
        int i3 = this.zzd;
        this.zzd = 0;
        int i5 = this.zzb + this.zzc;
        this.zzb = i5;
        if (i5 <= 0) {
            this.zzc = 0;
            return i3;
        }
        this.zzc = i5;
        this.zzb = 0;
        return i3;
    }
}
