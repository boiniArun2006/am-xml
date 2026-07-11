package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeda implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeda(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar3;
        this.zzb = zzikpVar4;
    }

    public static zzeda zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeda(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecz zzb() {
        return new zzecz(zzfmq.zzc(), zzfmk.zzc(), ((zzedn) this.zza).zzb(), zzikf.zzc(this.zzb));
    }
}
