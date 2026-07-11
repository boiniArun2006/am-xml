package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final /* synthetic */ class zzboc implements zzboh {
    static final /* synthetic */ zzboc zza = new zzboc();

    private /* synthetic */ zzboc() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckx zzckxVar = (zzckx) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() && str.isEmpty()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcjc zzcjcVar = (zzcjc) zzckxVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzckxVar.getContext(), ((zzclf) zzckxVar).zzs().afmaVersion, str, null, zzcjcVar.zzC() != null ? zzcjcVar.zzC().zzax : null).zzb();
        }
    }
}
