package com.google.android.gms.internal.ads;

import androidx.content.core.DataStore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgag implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgag(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar3;
    }

    public static zzgag zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzgag(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgaf zzb() {
        return new zzgaf((DataStore) this.zza.zzb(), zzcml.zzc(), (zzdvj) this.zzb.zzb(), new zzfze());
    }
}
