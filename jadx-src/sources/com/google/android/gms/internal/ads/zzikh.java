package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzikh implements zzikg, zzika {
    private static final zzikh zza = new zzikh(null);
    private final Object zzb;

    private zzikh(Object obj) {
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        return this.zzb;
    }

    public static zzikg zza(Object obj) {
        zziko.zza(obj, "instance cannot be null");
        return new zzikh(obj);
    }

    public static zzikg zzc(Object obj) {
        return obj == null ? zza : new zzikh(obj);
    }
}
