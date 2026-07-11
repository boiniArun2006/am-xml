package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzchj extends com.google.android.gms.ads.internal.util.zzb {
    final zzcge zza;
    final zzchr zzb;
    private final String zzc;
    private final String[] zzd;

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchh(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final com.google.common.util.concurrent.Xo zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcC)).booleanValue() && (this.zzb instanceof zzcia)) ? zzcei.zzf.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzchi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }

    zzchj(zzcge zzcgeVar, zzchr zzchrVar, String str, String[] strArr) {
        this.zza = zzcgeVar;
        this.zzb = zzchrVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }
}
