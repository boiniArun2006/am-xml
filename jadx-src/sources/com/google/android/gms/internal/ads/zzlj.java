package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface zzlj {
    zzaan zze(zzpq zzpqVar);

    default void zza(zzpq zzpqVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzpq zzpqVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzpq zzpqVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default long zzf(zzpq zzpqVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzpq zzpqVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzli zzliVar) {
        long j2 = zzliVar.zzd;
        throw null;
    }

    default boolean zzi(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        throw null;
    }

    default boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j2) {
        zzee.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
