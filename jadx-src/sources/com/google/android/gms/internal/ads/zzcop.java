package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcop implements zzfik {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcop(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    public final /* synthetic */ zzfik zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    public final zzfil zza() {
        zziko.zzc(this.zzb, Context.class);
        return new zzcoq(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfik
    public final /* bridge */ /* synthetic */ zzfik zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
