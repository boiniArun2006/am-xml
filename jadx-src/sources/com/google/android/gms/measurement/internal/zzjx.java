package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjx implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzli zzb;

    zzjx(zzli zzliVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar = this.zzb;
        zzib zzibVar = zzliVar.zzu;
        boolean zZzB = zzibVar.zzB();
        boolean zZzA = zzibVar.zzA();
        boolean z2 = this.zza;
        zzibVar.zzz(z2);
        if (zZzA == z2) {
            zzibVar.zzaV().zzk().zzb("Default data collection state already set to", Boolean.valueOf(z2));
        }
        if (zzibVar.zzB() == zZzB || zzibVar.zzB() != zzibVar.zzA()) {
            zzibVar.zzaV().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(z2), Boolean.valueOf(zZzB));
        }
        zzliVar.zzak();
    }
}
