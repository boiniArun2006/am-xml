package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdnj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdnj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdnj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdnj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjg((Context) this.zza.zzb(), new HashSet(), ((zzcww) this.zzb).zza());
    }
}
