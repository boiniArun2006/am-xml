package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdhg implements zzikg {
    private final zzdhf zza;
    private final zzikp zzb;

    private zzdhg(zzdhf zzdhfVar, zzikp zzikpVar) {
        this.zza = zzdhfVar;
        this.zzb = zzikpVar;
    }

    public static zzdhg zza(zzdhf zzdhfVar, zzikp zzikpVar) {
        return new zzdhg(zzdhfVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdbh zzdbhVarZzp = this.zza.zzp(((zziks) this.zzb).zzb());
        zziko.zzb(zzdbhVarZzp);
        return zzdbhVarZzp;
    }
}
