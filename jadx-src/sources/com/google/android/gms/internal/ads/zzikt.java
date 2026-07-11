package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzikt implements zzikp {
    private static final Object zza = new Object();
    private volatile zzikp zzb;
    private volatile Object zzc = zza;

    private zzikt(zzikp zzikpVar) {
        this.zzb = zzikpVar;
    }

    public static zzikp zza(zzikp zzikpVar) {
        return ((zzikpVar instanceof zzikt) || (zzikpVar instanceof zzikf)) ? zzikpVar : new zzikt(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzikp zzikpVar = this.zzb;
        if (zzikpVar == null) {
            return this.zzc;
        }
        Object objZzb = zzikpVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
