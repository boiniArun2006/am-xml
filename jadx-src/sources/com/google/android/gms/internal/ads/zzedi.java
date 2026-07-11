package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzedi implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzedi(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzedi zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzedi(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzb() {
        com.google.common.util.concurrent.Xo xoSubmit;
        final zzazh zzazhVar = (zzazh) this.zza.zzb();
        final Context contextZza = ((zzcmj) this.zzb).zza();
        zzfjk zzfjkVarZza = ((zzdaw) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdu)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVarZza.zzd)))) {
                xoSubmit = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdw)).intValue()) ? zzgzyVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzazhVar.zzb().zzk(contextZza);
                    }
                }) : zzgzyVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedc
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzazhVar.zzb().zzl(contextZza);
                    }
                });
            }
        }
        zziko.zzb(xoSubmit);
        return xoSubmit;
    }
}
