package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcon implements zzegd {
    private final zzcnp zza;
    private final zzcom zzb;
    private zzeek zzc;

    /* synthetic */ zzcon(zzcnp zzcnpVar, zzcom zzcomVar, byte[] bArr) {
        this.zza = zzcnpVar;
        this.zzb = zzcomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public final zzege zza() {
        zziko.zzc(this.zzc, zzeek.class);
        return new zzcoo(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public final /* bridge */ /* synthetic */ zzegd zzb(zzeek zzeekVar) {
        this.zzc = zzeekVar;
        return this;
    }
}
