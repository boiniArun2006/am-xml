package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhkd {
    private static final zzhkd zza = new zzhkd();
    private final AtomicReference zzb = new AtomicReference(new zzhky(new zzhkv(null), null));

    public static zzhkd zza() {
        return zza;
    }

    public final synchronized void zzb(zzhku zzhkuVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkv zzhkvVar = new zzhkv((zzhky) atomicReference.get(), null);
        zzhkvVar.zza(zzhkuVar);
        atomicReference.set(new zzhky(zzhkvVar, null));
    }

    public final synchronized void zzc(zzhla zzhlaVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkv zzhkvVar = new zzhkv((zzhky) atomicReference.get(), null);
        zzhkvVar.zzb(zzhlaVar);
        atomicReference.set(new zzhky(zzhkvVar, null));
    }

    public final Object zzd(zzhaz zzhazVar, Class cls) throws GeneralSecurityException {
        return ((zzhky) this.zzb.get()).zzb(zzhazVar, cls);
    }

    public final Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, Class cls) throws GeneralSecurityException {
        return ((zzhky) this.zzb.get()).zzc(zzhjjVar, zzhjrVar, cls);
    }

    zzhkd() {
    }
}
