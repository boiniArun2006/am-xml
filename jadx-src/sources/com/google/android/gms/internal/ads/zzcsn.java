package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcsn {
    private final String zza;
    private final zzbti zzb;
    private final Executor zzc;
    private zzcss zzd;
    private final zzboh zze = new zzcsk(this);
    private final zzboh zzf = new zzcsm(this);

    final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzcss zzg() {
        return this.zzd;
    }

    public final void zza(zzcss zzcssVar) {
        zzbti zzbtiVar = this.zzb;
        zzbtiVar.zzb("/updateActiveView", this.zze);
        zzbtiVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcssVar;
    }

    public final void zzb(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/updateActiveView", this.zze);
        zzcjlVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcjl zzcjlVar) {
        zzcjlVar.zzac("/updateActiveView", this.zze);
        zzcjlVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbti zzbtiVar = this.zzb;
        zzbtiVar.zzc("/updateActiveView", this.zze);
        zzbtiVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    public zzcsn(String str, zzbti zzbtiVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbtiVar;
        this.zzc = executor;
    }
}
