package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdki extends zzdhd {
    private boolean zzb;

    public final synchronized void zzc() {
        zzs(zzdke.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdkg.zza);
                this.zzb = true;
            }
            zzs(zzdkf.zza);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zza() {
        zzs(zzdkh.zza);
    }

    public final void zzb() {
        zzs(zzdkd.zza);
    }

    protected zzdki(Set set) {
        super(set);
    }
}
