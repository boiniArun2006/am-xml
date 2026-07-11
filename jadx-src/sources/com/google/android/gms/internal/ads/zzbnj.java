package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnj implements zzboh {
    zzbnj() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            zzgal.zzh(zzcjlVar.getContext()).zzk();
            zzgam.zzh(zzcjlVar.getContext()).zzj();
            zzgan.zza(zzcjlVar.getContext()).zzb(null);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
