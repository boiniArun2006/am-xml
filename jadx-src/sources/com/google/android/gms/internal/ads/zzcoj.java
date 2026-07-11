package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcoj implements zzfgx {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* synthetic */ zzcoj(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final zzfgy zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, String.class);
        zziko.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcok(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final /* bridge */ /* synthetic */ zzfgx zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final /* bridge */ /* synthetic */ zzfgx zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final /* bridge */ /* synthetic */ zzfgx zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
