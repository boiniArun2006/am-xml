package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdna implements zzboh {
    private final WeakReference zza;
    private final zzfqk zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfoo zzd;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        String str = (String) map.get("u");
        if (zzdnbVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdnbVar.zzF());
    }

    /* synthetic */ zzdna(zzdnb zzdnbVar, zzfqk zzfqkVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfoo zzfooVar, byte[] bArr) {
        this.zza = new WeakReference(zzdnbVar);
        this.zzb = zzfqkVar;
        this.zzc = zzvVar;
        this.zzd = zzfooVar;
    }
}
