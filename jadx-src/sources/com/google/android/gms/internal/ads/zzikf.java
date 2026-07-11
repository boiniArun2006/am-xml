package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzikf implements zzikp, zzika {
    private static final Object zza = new Object();
    private volatile zzikp zzb;
    private volatile Object zzc = zza;

    private zzikf(zzikp zzikpVar) {
        this.zzb = zzikpVar;
    }

    public static zzikp zza(zzikp zzikpVar) {
        return zzikpVar instanceof zzikf ? zzikpVar : new zzikf(zzikpVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzika zzc(zzikp zzikpVar) {
        if (zzikpVar instanceof zzika) {
            return (zzika) zzikpVar;
        }
        zzikpVar.getClass();
        return new zzikf(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
