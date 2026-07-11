package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzayy implements Runnable {
    final /* synthetic */ zzayz zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzayz zzayzVar = this.zza;
        synchronized (zzayzVar.zzp()) {
            if (zzayzVar.zzq()) {
                return;
            }
            zzayzVar.zzr(true);
            try {
                zzayzVar.zzn();
            } catch (Exception e2) {
                this.zza.zzo().zzc(2023, -1L, e2);
            }
            zzayz zzayzVar2 = this.zza;
            synchronized (zzayzVar2.zzp()) {
                zzayzVar2.zzr(false);
            }
        }
    }

    zzayy(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
    }
}
