package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzeey implements zzdel {
    private final Context zza;
    private final zzccq zzb;

    zzeey(Context context, zzccq zzccqVar) {
        this.zza = context;
        this.zzb = zzccqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        String str = zzfjcVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzccq zzccqVar = this.zzb;
        Context context = this.zza;
        zzccqVar.zzc(context, zzfjcVar.zza.zza.zzd);
        zzccqVar.zzm(context, str);
    }
}
