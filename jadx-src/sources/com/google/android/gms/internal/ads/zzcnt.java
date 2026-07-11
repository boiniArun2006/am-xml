package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcnt implements zzfdu {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcnt(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    public final zzfdv zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, String.class);
        return new zzcnu(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    public final /* bridge */ /* synthetic */ zzfdu zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    public final /* bridge */ /* synthetic */ zzfdu zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
