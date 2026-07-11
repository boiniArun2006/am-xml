package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaju {
    private final zzakg zza;
    private final byte[] zzb;

    private zzaju(int i2) {
        byte[] bArr = new byte[i2];
        this.zzb = bArr;
        this.zza = zzakg.zzb(bArr);
    }

    public final zzajp zza() {
        this.zza.zzb();
        return new zzajw(this.zzb);
    }

    public final zzakg zzb() {
        return this.zza;
    }
}
