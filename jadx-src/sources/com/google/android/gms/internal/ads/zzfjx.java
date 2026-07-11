package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfjx {
    private final zzfir zza;
    private final zzfiu zzb;
    private final zzfqk zzc;
    private final zzfqc zzd;
    private final zzfoo zze;
    private final zzcrv zzf;

    @VisibleForTesting
    public zzfjx(zzfqk zzfqkVar, zzfqc zzfqcVar, zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar, zzfoo zzfooVar) {
        this.zza = zzfirVar;
        this.zzb = zzfiuVar;
        this.zzc = zzfqkVar;
        this.zzd = zzfqcVar;
        this.zzf = zzcrvVar;
        this.zze = zzfooVar;
    }

    public final void zzc(String str, int i2, @Nullable zzddu zzdduVar) {
        zzfir zzfirVar = this.zza;
        if (zzfirVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i2);
            return;
        }
        this.zzc.zzb(str, zzfirVar.zzax, this.zze, zzdduVar);
    }

    public final void zza(List list, @Nullable zzddu zzdduVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdduVar);
        }
    }

    public final void zzb(List list, int i2) {
        com.google.common.util.concurrent.Xo xoZza;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && zzcrv.zzc(str)) {
                xoZza = this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbb.zzh());
            } else {
                xoZza = zzgzo.zza(str);
            }
            zzgzo.zzr(xoZza, new zzfjw(this, i2), zzcei.zza);
        }
    }
}
