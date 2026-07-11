package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeyg implements zzfav {
    private final Boolean zza;

    public zzeyg(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bool != null) {
            zzdahVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
