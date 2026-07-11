package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfmb {
    private final zzflt zza;
    private final com.google.common.util.concurrent.Xo zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public final synchronized void zza(zzgzl zzgzlVar) {
        zzflt zzfltVar = this.zza;
        zzgzo.zzr(zzgzo.zzj(this.zzb, zzflz.zza, zzfltVar.zza()), zzgzlVar, zzfltVar.zza());
    }

    public final synchronized com.google.common.util.concurrent.Xo zzb(zzflt zzfltVar) {
        if (!this.zzd && !this.zzc) {
            zzflt zzfltVar2 = this.zza;
            if (zzfltVar2.zzb() != null && zzfltVar.zzb() != null && zzfltVar2.zzb().equals(zzfltVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzfls zzflsVar, zzfkz zzfkzVar, zzflt zzfltVar, zzfli zzfliVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzflsVar.zzb(zzfliVar);
                if (this.zzc) {
                    return zzgzo.zza(new zzflr(zzfliVar, zzfltVar));
                }
                zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
                return zzgzo.zza(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzd(zzfls zzflsVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public zzfmb(final zzfkz zzfkzVar, final zzfls zzflsVar, final zzflt zzfltVar) {
        this.zza = zzfltVar;
        this.zzb = zzgzo.zzh(zzgzo.zzj(zzflsVar.zza(zzfltVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfma
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc(zzflsVar, zzfkzVar, zzfltVar, (zzfli) obj);
            }
        }, zzfltVar.zza()), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfly
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzd(zzflsVar, (Exception) obj);
            }
        }, zzfltVar.zza());
    }
}
