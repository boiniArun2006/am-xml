package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzhr {
    private final byte zza;
    private final byte zzb;

    zzhr(int i2) {
        this.zza = (byte) (i2 & 224);
        this.zzb = (byte) (i2 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
