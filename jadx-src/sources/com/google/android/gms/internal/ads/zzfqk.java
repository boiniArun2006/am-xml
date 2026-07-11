package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfqk {
    private final Context zza;
    private final Executor zzb;
    private final zzgzz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfqc zze;
    private final zzfor zzf;
    private final zzclx zzg;

    zzfqk(Context context, Executor executor, zzgzz zzgzzVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfqc zzfqcVar, zzfor zzforVar, zzclx zzclxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgzzVar;
        this.zzd = zzuVar;
        this.zze = zzfqcVar;
        this.zzf = zzforVar;
        this.zzg = zzclxVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfor zze() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzd.zzc(str, null);
        }
        String strZzb = this.zzg.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), strZzb);
        }
        return this.zzd.zzc(str, map);
    }

    public final void zza(List list, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar, @Nullable zzfoo zzfooVar, @Nullable zzddu zzdduVar) {
        com.google.common.util.concurrent.Xo xoSubmit;
        zzfoe zzfoeVarZzn = null;
        if (zzfor.zza() && ((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoeVarZzn = zzfoe.zzn(this.zza, 14);
            zzfoeVarZzn.zza();
        }
        if (zzvVar != null) {
            xoSubmit = new zzfqb(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            xoSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgzo.zzr(xoSubmit, new zzfqi(this, zzfoeVarZzn, zzfooVar, zzdduVar), this.zzb);
    }
}
