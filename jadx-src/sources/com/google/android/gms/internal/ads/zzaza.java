package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        synchronized (zzazb.zzd) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                zBooleanValue = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z2 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z2 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z2);
            zzazb.zzd.open();
        }
    }

    zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }
}
