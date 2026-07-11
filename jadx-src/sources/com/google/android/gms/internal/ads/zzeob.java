package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeob implements zzikg {
    private final zzeoa zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzeob(zzeoa zzeoaVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzeoaVar;
        this.zzb = zzikpVar;
        this.zzc = zzikpVar2;
        this.zzd = zzikpVar3;
        this.zze = zzikpVar4;
    }

    public static zzeob zza(zzeoa zzeoaVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeob(zzeoaVar, zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((Clock) this.zzb.zzb(), ((zzenu) this.zzc).zzb(), (zzekl) this.zzd.zzb(), (zzfqk) this.zze.zzb());
    }
}
