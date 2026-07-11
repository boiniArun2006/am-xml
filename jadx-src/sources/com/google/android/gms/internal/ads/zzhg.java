package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhg implements zzha {
    private final Context zza;
    private final zzha zzb;

    public zzhg(Context context) {
        zzhi zzhiVar = new zzhi();
        this.zza = context.getApplicationContext();
        this.zzb = zzhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final /* bridge */ /* synthetic */ zzhb zza() {
        return new zzhh(this.zza, this.zzb.zza());
    }
}
