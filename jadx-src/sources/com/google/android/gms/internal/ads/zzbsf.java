package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbsf extends zzceu {
    private final Object zza = new Object();
    private final zzbsk zzb;
    private boolean zzc;

    final /* synthetic */ zzbsk zzb() {
        return this.zzb;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbsc(this), new zzceq());
                zze(new zzbsd(this), new zzbse(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbsf(zzbsk zzbskVar) {
        this.zzb = zzbskVar;
    }
}
