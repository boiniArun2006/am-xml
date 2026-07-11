package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzd(int i2) {
        return zze(2);
    }

    private final com.google.common.util.concurrent.Xo zze(final int i2) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i2);
            }
        }, this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    final /* synthetic */ zzgdv zzc(int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i3 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i3 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    final com.google.common.util.concurrent.Xo zzb(int i2, boolean z2) {
        com.google.common.util.concurrent.Xo xoZze = zze(i2);
        if (z2 && i2 != 2) {
            return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(xoZze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
        }
        return xoZze;
    }
}
