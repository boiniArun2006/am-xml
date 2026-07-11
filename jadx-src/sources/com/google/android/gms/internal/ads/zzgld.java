package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgld implements zzgky {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzgct zzc;
    private final zzgct zzd;
    private final zzika zze;
    private final zzika zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgoe zzi;

    zzgld(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgct zzgctVar3, zzgct zzgctVar4, zzika zzikaVar2, File file, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzc = zzgctVar2;
        this.zze = zzikaVar;
        this.zzb = zzgctVar3;
        this.zzd = zzgctVar4;
        this.zzf = zzikaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgoeVar;
    }

    private final com.google.common.util.concurrent.Xo zzj(byte[] bArr) {
        com.google.common.util.concurrent.Xo xoZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, xoZzc);
        return xoZzc;
    }

    private final com.google.common.util.concurrent.Xo zzk(zzgdu zzgduVar) {
        com.google.common.util.concurrent.Xo xoZzc = this.zzb.zzc(zzgduVar);
        this.zzi.zze(15303, xoZzc);
        return xoZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzb() {
        com.google.common.util.concurrent.Xo xoZzb = this.zza.zzb();
        this.zzi.zze(15302, xoZzb);
        return xoZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.Xo xoZzc = ((zzgct) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, xoZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(xoZzc, zzj(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzi(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final com.google.common.util.concurrent.Xo zze() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(this.zza.zzb()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzgdu) obj);
            }
        }, zzhaf.zza());
        this.zzi.zze(15314, zzgzgVar);
        return zzgzgVar;
    }

    final /* synthetic */ boolean zzf() {
        zzgct zzgctVar;
        try {
            zzgct zzgctVar2 = this.zzb;
            File fileZza = zzgctVar2.zza();
            if (!fileZza.exists()) {
                zzgctVar2.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File fileZza2 = ((zzgct) this.zzf.zzb()).zza();
            File fileZza3 = ((zzgct) this.zze.zzb()).zza();
            try {
                if (fileZza2.exists()) {
                    File parentFile = fileZza3.getParentFile();
                    if (parentFile != null) {
                        zzfws.zze(parentFile);
                    }
                    zzgxm.zzb(fileZza3);
                    zzgxm.zzc(fileZza2, fileZza3);
                }
                File fileZza4 = this.zzd.zza();
                File fileZza5 = this.zzc.zza();
                try {
                    if (fileZza4.exists()) {
                        zzgxm.zzb(fileZza5);
                        zzgxm.zzc(fileZza4, fileZza5);
                    }
                    File fileZza6 = this.zza.zza();
                    try {
                        if (fileZza.exists()) {
                            zzgxm.zzb(fileZza6);
                            zzgxm.zzc(fileZza, fileZza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e2) {
                        this.zzi.zzd(15313, e2);
                        zzgctVar = this.zzb;
                        zzgctVar.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e3) {
                    this.zzi.zzd(15312, e3);
                    zzgctVar = this.zzb;
                }
            } catch (IOException e4) {
                e = e4;
                this.zzi.zzd(15311, e);
                zzgctVar = this.zzb;
                zzgctVar.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            } catch (SecurityException e5) {
                e = e5;
                this.zzi.zzd(15311, e);
                zzgctVar = this.zzb;
                zzgctVar.zza().delete();
                ((zzgct) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfwq zzg(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            return null;
        }
        zzbcp zzbcpVarZza = zzgduVar.zza();
        File fileZza = ((zzgct) this.zze.zzb()).zza();
        zzgct zzgctVar = this.zzc;
        return new zzfwq(zzbcpVarZza, fileZza, zzgctVar.zza(), this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.Xo zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzj(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzh(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzh(zzgdu zzgduVar, Void r2) {
        return zzk(zzgduVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzi(zzgdu zzgduVar, List list) {
        return zzk(zzgduVar);
    }
}
