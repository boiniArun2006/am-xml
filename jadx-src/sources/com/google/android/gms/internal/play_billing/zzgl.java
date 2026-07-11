package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgl extends zzgn {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzgl(byte[] bArr, int i2, int i3, boolean z2, zzgm zzgmVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i2) throws zzhr {
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
