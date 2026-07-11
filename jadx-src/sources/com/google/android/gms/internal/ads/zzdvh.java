package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvh {
    private final zzfyv zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public final void zza(zzbdz zzbdzVar) {
        this.zzc.set(true);
        zzbdzVar.zzg(this);
        this.zza.zza();
    }

    public final void zzc() {
        if (this.zzb.get()) {
            this.zza.zzg();
        }
    }

    public final void zzd() {
        if (this.zzb.getAndSet(false)) {
            this.zza.zze();
        }
    }

    public final void zze(Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzd();
        }
    }

    public final void zzf(Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzc();
        }
    }

    public final boolean zzg(Activity activity) {
        if (!this.zzb.getAndSet(false)) {
            return false;
        }
        this.zza.zzf();
        return false;
    }

    zzdvh(zzfyv zzfyvVar) {
        this.zza = zzfyvVar;
    }

    public final void zzb(String str) {
        if (!zzgrt.zzc(str) && this.zzc.get() && !this.zzb.getAndSet(true)) {
            this.zza.zzb(str);
        }
    }
}
