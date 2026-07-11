package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzb() {
        com.google.common.util.concurrent.Xo xoZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, xoZzd);
        return xoZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzc(final zzgdu zzgduVar, final byte[] bArr, final byte[] bArr2) {
        com.google.common.util.concurrent.Xo xoZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzgduVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, xoZzd);
        return xoZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzd(final zzgdu zzgduVar, final byte[] bArr) {
        com.google.common.util.concurrent.Xo xoZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzgduVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, xoZzd);
        return xoZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final com.google.common.util.concurrent.Xo zze() {
        com.google.common.util.concurrent.Xo xoZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, xoZzd);
        return xoZzd;
    }

    final /* synthetic */ zzgdu zzf() {
        zzgdu zzgduVarZzc = this.zza.zzc(1);
        return zzgduVarZzc == null ? zzgdu.zzg() : zzgduVarZzc;
    }

    final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
