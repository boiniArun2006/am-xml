package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeyu implements zzfav {
    public final zzfiq zza;

    public zzeyu(zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        zzfiq zzfiqVar = this.zza;
        if (zzfiqVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzns)).booleanValue()) {
                return;
            }
            Bundle bundle = zzdahVar.zza;
            bundle.putBoolean("render_in_browser", zzfiqVar.zzb());
            bundle.putBoolean("disable_ml", zzfiqVar.zzc());
        }
    }
}
