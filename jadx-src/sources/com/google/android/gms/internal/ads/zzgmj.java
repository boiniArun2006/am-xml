package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final com.google.common.util.concurrent.Xo zzh(zzgdu zzgduVar) {
        com.google.common.util.concurrent.Xo xoZzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, xoZzc);
        return xoZzc;
    }

    private final com.google.common.util.concurrent.Xo zzi(byte[] bArr) {
        com.google.common.util.concurrent.Xo xoZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, xoZzc);
        return xoZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzb() {
        com.google.common.util.concurrent.Xo xoZzb = this.zza.zzb();
        this.zzd.zze(20302, xoZzb);
        return xoZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.Xo xoZzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, xoZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(xoZzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final com.google.common.util.concurrent.Xo zze() {
        com.google.common.util.concurrent.Xo xoZzb = this.zzb.zzb();
        this.zzd.zze(20304, xoZzb);
        return xoZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzf(zzgdu zzgduVar, Void r2) {
        return zzh(zzgduVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
